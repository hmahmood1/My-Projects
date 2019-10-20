package com.revature;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.revature.controller.Controller;
import com.revature.exception.exceededFunds;
import com.revature.model.BankAccount;
import com.revature.repository.BankAccountConn;
import com.revature.repository.BankAccountDAOImpl;
import com.revature.repository.BankAppDAO;

/*
 * Create an instance of your controller and launch your application.
 * 
 * Try not to have any logic at all on this class.
 */
public class Main {

	public static void main(String[] args) {
		
//		BankAccountConn.getConnection();
//		BankAppDAO bankAccount = new BankAccountDAOImpl();
//		BankAccount testBankAccount = new BankAccount(String account_id, String firstName, String LastName, int checkingBalance, int savingsBalance);
		Controller.input();
		
	}
}