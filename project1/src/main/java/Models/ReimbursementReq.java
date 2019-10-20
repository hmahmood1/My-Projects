package Models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReimbursementReq {
	
	private static String first_name;
	private static String last_name;
	private static String reimbursement_type;
	private static int reimbursement_amount;
	
	public ReimbursementReq(String first_name, String last_name, String reimbursement_type, int reimbursement_amount) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.reimbursement_type = reimbursement_type;
		this.reimbursement_amount = reimbursement_amount;
	}
	
	public ReimbursementReq(ResultSet resultSet) throws SQLException {
		this(resultSet.getString("first_name"),
				resultSet.getString("last_name"),
				resultSet.getString("reimbursement_type"),
				resultSet.getInt("reimbursement_amount"));
	}
	
	public ReimbursementReq() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String getFirst_name() {
		return first_name;
	}
	public static void setFirst_name(String first_name) {
		ReimbursementReq.first_name = first_name;
	}
	public static String getLast_name() {
		return last_name;
	}
	public static void setLast_name(String last_name) {
		ReimbursementReq.last_name = last_name;
	}
	public static String getReimbursement_type() {
		return reimbursement_type;
	}
	public static void setReimbursement_type(String reimbursement_type) {
		ReimbursementReq.reimbursement_type = reimbursement_type;
	}
	public static int getReimbursement_amount() {
		return reimbursement_amount;
	}
	public static void setReimbursement_amount(int reimbursement_amount) {
		ReimbursementReq.reimbursement_amount = reimbursement_amount;
	}
	@Override
	public String toString() {
		return "ReimbursementReq [First Name: " + first_name + " Last Name: " + last_name + " Reimbursement Type: " + reimbursement_type + 
				" Reimbursement Amount: " + reimbursement_amount + "]";
	}
}