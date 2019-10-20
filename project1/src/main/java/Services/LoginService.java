package Services;

import Models.UserModel;
import Project1DAO.UserModelDAO;

public class LoginService {
	
	static UserModelDAO userDAO;
	static LoginService ls;
	
	private LoginService(UserModelDAO userDAO) {
		this.userDAO = userDAO;
	}
	public static LoginService getInstance(UserModelDAO userDAO) {
		if(ls==null) {
			ls = new LoginService(userDAO);
			return ls;
		} else {
			return ls;
		}
	}
	public static LoginService getInstance(String id, String wordPass) {
		if(ls==null) {
			throw new RuntimeException("No Login Service");
		}
		return ls;
	}
	public boolean validate(int id, String wordPass) {
		UserModel user = userDAO.getUser(id, wordPass);
		return user==null ? false : true;
	}
	public static UserModel getUser(int id, String wordPass) {
		UserModel user = userDAO.getUser(id, wordPass);
		return user;
	}
}