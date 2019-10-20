package Models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserModel {
	
	private static int id;
	private static String first_name;
	private static String last_name;
	private static String job_title;
	private static int salary;
	private static String address;
	private static int reimbursement_amount;
	private static String reimbursement_type;
	private static String password;
	
	public UserModel(int id, String first_name, String last_name, String job_title, int salary, String address, 
			int reimbursement_amount, String reimbursement_type, String password) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.job_title = job_title;
		this.salary = salary;
		this.address = address;
		this.reimbursement_amount = reimbursement_amount;
		this.reimbursement_type = reimbursement_type;
		this.password = password;
	}
	
	public UserModel(ResultSet resultSet) throws SQLException {
		this(resultSet.getInt("id"),
				resultSet.getString("first_name"),
				resultSet.getString("last_name"),
				resultSet.getString("job_title"),
				resultSet.getInt("salary"),
				resultSet.getString("address"),
				resultSet.getInt("reimbursement_amount"),
				resultSet.getString("reimbursement_type"),
				resultSet.getString("password"));
	}
	public UserModel() {
		super();
	}

	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		UserModel.id = id;
	}
	public static String getFirst_name() {
		return first_name;
	}
	public static void setFirst_name(String first_name) {
		UserModel.first_name = first_name;
	}
	public static String getLast_name() {
		return last_name;
	}
	public static void setLast_name(String last_name) {
		UserModel.last_name = last_name;
	}
	public static String getJob_title() {
		return job_title;
	}
	public static void setJob_title(String job_title) {
		UserModel.job_title = job_title;
	}
	public static int getSalary() {
		return salary;
	}
	public static void setSalary(int salary) {
		UserModel.salary = salary;
	}
	public static String getAddress() {
		return address;
	}
	public static void setAddress(String address) {
		UserModel.address = address;
	}
	public static int getReimbursement_amount() {
		return reimbursement_amount;
	}
	public static void setReimbursement_amount(int reimbursement_amount) {
		UserModel.reimbursement_amount = reimbursement_amount;
	}
	public static String getReimursement_type() {
		return reimbursement_type;
	}
	public static void setReimbursement_type() {
		UserModel.reimbursement_type = reimbursement_type;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		UserModel.password = password;
	}
	@Override
	public String toString() {
		return "UserModel [Id: " + id + " Password: " + password + " First Name: " + first_name + " Last Name: " + last_name + 
				" Job Title: " + job_title + " Salary: " + salary + " Address: " + address + " Reimbursement_Amount: " + reimbursement_amount + 
				" Reimbursement_Type" + reimbursement_type + "]";
	}
}