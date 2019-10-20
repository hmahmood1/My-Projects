package com.revature.repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class BankAccountConn {
	
	private static Connection conn = null;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		
		try {
			Properties properties = new Properties();
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			properties.load(loader.getResourceAsStream("ConnectionFile.Properties"));
			
			String url = properties.getProperty("url");
			String username = properties.getProperty("Username");
			String password = properties.getProperty("Password");
			
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("==ACCESS GRANTED==");
		} catch (IOException | SQLException e){
			e.printStackTrace();
		}
		return conn;
	}
}