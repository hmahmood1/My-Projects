package ConnectionUtilProject1;

import Models.UserModel;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectionDatabase conn = new ConnectionDatabase();
		conn.getConnection();
	}
}