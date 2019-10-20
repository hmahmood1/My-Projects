package Project1DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ConnectionUtilProject1.CloseDataBase;
import ConnectionUtilProject1.ConnectionDatabase;
import Models.UserModel;

public class UserModelDAOImplOJDBC implements UserModelDAO {

//	@Override
//	public UserModel getUser(long id) {
//		PreparedStatement statement = null;
//		ResultSet resultSet = null;
//		UserModel user = null;
//		
//		try (Connection conn = ConnectionDatabase.getConnection()){
//			statement = conn.prepareStatement("SELECT * FROM Staff_Info WHERE id =?");
//			statement.setLong(1, id);
//			statement.execute();
//			resultSet = statement.getResultSet();
//			user = new UserModel(resultSet);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}

	public UserModelDAOImplOJDBC() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserModel getUser(String password) {
//		PreparedStatement statement = null;
//		ResultSet resultSet = null;
//		UserModel user = null;
//		
//		try (Connection conn = ConnectionDatabase.getConnection()){
//			statement = conn.prepareStatement("SELECT * FROM Staff_Info WHERE Password =?");
//			statement.setString(2, password);
//			statement.execute();
//			resultSet = statement.getResultSet();
//			user = new UserModel(resultSet);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel updateUserInfo(String job_title, String address, int salary, int id) {
		// TODO Auto-generated method stub
		PreparedStatement statement = null;
		UserModel userInfoUpdated = null;
		
		try (Connection conn = ConnectionDatabase.getConnection()){
			statement = conn.prepareStatement("UPDATE staff_info SET JOB_TITLE = ?, ADDRESS = ?, SALARY = ? WHERE ID = ?");
			statement.setString(1, job_title);
			statement.setString(2, address);
			statement.setInt(3, salary);
			statement.setInt(4, id);
			statement.execute();
			ResultSet resultSet = statement.getResultSet();
		} catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserModel getUser(int id, String password) {
		// TODO Auto-generated method stub
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		UserModel user = null;
		
		try (Connection conn = ConnectionDatabase.getConnection()){
			statement = conn.prepareStatement("SELECT * FROM Staff_Info WHERE id =? AND password =?");
			statement.setInt(1, id);
			statement.setString(2, password);
			statement.execute();
			resultSet = statement.getResultSet();
			resultSet.next();
			user = new UserModel(resultSet.getInt("id"),
					resultSet.getString("first_name"),
					resultSet.getString("last_name"),
					resultSet.getString("job_title"),
					resultSet.getInt("salary"),
					resultSet.getString("address"),
					resultSet.getInt("reimbursement_amount"),
					resultSet.getString("reimbursement_type"),
					resultSet.getString("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			CloseDataBase.close(statement);
			CloseDataBase.close(resultSet);
		}
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public UserModel updateReimbursement(int reimbursement_amount, String reimbursement_type, String first_name, String last_name) {
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		UserModel reimbursementReq = null;
		
		try (Connection conn = ConnectionDatabase.getConnection()){
			statement = conn.prepareStatement("UPDATE Staff_info SET reimbursement_amount=?, reimbursement_type=? WHERE first_name=? AND last_name=?");
			statement.setInt(1, reimbursement_amount);
			statement.setString(2, reimbursement_type);
			statement.setString(3, first_name);
			statement.setString(4, last_name);
			statement.execute();
			resultSet = statement.getResultSet();
			resultSet.next();
			reimbursementReq = new UserModel(resultSet.getInt("id"),
					resultSet.getString("first_name"),
					resultSet.getString("last_name"),
					resultSet.getString("job_title"),
					resultSet.getInt("salary"),
					resultSet.getString("address"),
					resultSet.getInt("reimbursement_amount"),
					resultSet.getString("reimbursement_type"),
					resultSet.getString("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		// TODO Auto-generated method stub
		return reimbursementReq;
	}
}