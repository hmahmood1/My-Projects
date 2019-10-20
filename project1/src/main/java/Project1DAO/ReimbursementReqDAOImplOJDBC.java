package Project1DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ConnectionUtilProject1.ConnectionDatabase;
import Models.ReimbursementReq;

public class ReimbursementReqDAOImplOJDBC implements ReimbursementReqDAO {

	@Override
	public ReimbursementReq setPendingRequests(String first_name, String last_name, int reimbursement_amount,
			String reimbursement_type) {
		PreparedStatement statement = null;
		ReimbursementReq reimbursementReq = null;
		
		
		try (Connection conn = ConnectionDatabase.getConnection()) {
			statement = conn.prepareStatement("INSERT INTO pending_reimbursements VALUES (?,?,?,?)");
			statement.setString(1, first_name);
			statement.setString(2, last_name);
			statement.setInt(3, reimbursement_amount);
			statement.setString(4, reimbursement_type);
			statement.execute();
//			ResultSet resultSet = statement.getResultSet();
//			reimbursementReq = new ReimbursementReq(resultSet.getString("first_name"),
//					resultSet.getString("last_name"),
//					resultSet.getString("reimbursement_type"),
//					resultSet.getInt("reimbursement_amount"));
			System.out.println("New row inserted into Pending Reimbursements Table");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return reimbursementReq;
	}

	@Override
	public List<ReimbursementReq> getPendingRequests() {
		
		Statement statement = null;
		ResultSet resultSet = null;
		List<ReimbursementReq> reimbursementReq = new ArrayList<>();
		
		try (Connection conn = ConnectionDatabase.getConnection()) {
			statement = conn.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM Pending_Reimbursements");
			while(resultSet.next()) {
				reimbursementReq.add(new ReimbursementReq(resultSet));
			}
//			statement.setString(1, first_name);
//			statement.setString(2, last_name);
//			statement.setInt(3, reimbursement_amount);
//			statement.setString(4, reimbursement_type);
//			statement.execute();
//			ResultSet resultSet = statement.getResultSet();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return reimbursementReq;
	}	
}