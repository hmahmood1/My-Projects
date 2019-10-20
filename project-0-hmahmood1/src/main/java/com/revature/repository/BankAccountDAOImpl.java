package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.model.BankAccount;
import com.revature.repository.Closestream;

public class BankAccountDAOImpl implements BankAppDAO {

	@Override
	public BankAccount getBankAccount(int account_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankAccount getBankAccount(String account_id) {
		// TODO Auto-generated method stub
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		BankAccount bankAccount = null;
		
		try(Connection conn = BankAccountConn.getConnection()){
			statement = conn.prepareStatement("SELECT c.account_id, c.first_name, c.last_name, ca.balance_checking, sa.balance_savings FROM customers c JOIN checking_account ca ON c.account_id = ca.account_id_id JOIN savings_account sa ON ca.account_number = sa.account_number WHERE account_id = ?");
			statement.setString(1, account_id);
			statement.execute();
			resultSet = statement.getResultSet();
			resultSet.next(); // goes to the first result
			bankAccount = new BankAccount(resultSet.getString("account_id"),
					resultSet.getString("first_name"),
					resultSet.getString("last_name"),
					resultSet.getInt("balance_checking"),
					resultSet.getInt("balance_savings"));
//					resultSet.getString("CUSTOMER_SINCE"),
//					resultSet.getLong("age"),
//					resultSet.getString("address"),
//					resultSet.getString("CITY_STATE"));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Closestream.close(statement);
			Closestream.close(resultSet);
		}
		return bankAccount;
	}

	@Override
	public boolean createBankAccount(BankAccount bankAccount) {
		PreparedStatement statement = null;
		try(Connection conn = BankAccountConn.getConnection()) {
			statement = conn.prepareStatement("INSERT INTO Customers VALUES(?,?,?,?,?)");
			statement.setString(1, bankAccount.getAccount_id());
			statement.setString(2, bankAccount.getFirstName());
			statement.setString(3, bankAccount.getLastName());
			statement.setInt(4, bankAccount.getCheckingBalance());
			statement.setInt(5, bankAccount.getSavingsBalance());
//			statement.setLong(4, bankAccount.getAge());
//			statement.setString(5, bankAccount.getAddress());
//			statement. setString(6, bankAccount.getCityState());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			Closestream.close(statement);
		}
		return true;
	}

	@Override
	public boolean updateBankAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BankAccount> getBankAccount() {
		// TODO Auto-generated method stub
		return null;
	}
}