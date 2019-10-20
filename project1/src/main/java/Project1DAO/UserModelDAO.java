package Project1DAO;

import Models.UserModel;

public interface UserModelDAO {
	
	//Getting the user using the password
	public UserModel getUser(String password);
	
	//Getting the user using the username(id) and password
	public UserModel getUser(int id, String password);
	
	//This method updates the User's Information
	public UserModel updateUserInfo(String job_title, String address, int salary, int id);
	
	//Updating the reimbursement amount and reimbursement type after approval/denial by the manager
	public UserModel updateReimbursement(int reimbursement_amount, String reimbursement_type, String first_name,
			String last_name);
	
}