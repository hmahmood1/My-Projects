package ConnectionUtilProject1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDatabase implements AutoCloseable{

	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@revature-project1.cqunalko0dqu.us-east-1.rds.amazonaws.com:1521:ORCL";
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, "hmahmood1", "Mahmood6");
			System.out.println("You have connected to the database!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}