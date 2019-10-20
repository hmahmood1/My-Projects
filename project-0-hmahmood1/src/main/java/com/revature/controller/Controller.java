package com.revature.controller;

import java.util.Scanner;

import com.revature.model.BankAccount;
import com.revature.repository.BankAccountDAOImpl;
import com.revature.repository.BankAppDAO;

public class Controller extends BankAccount {

	
	public Controller(String account_id, String firstName, String lastName, int checkingBalance, int savingsBalance) {
		super(account_id, firstName, lastName, checkingBalance, savingsBalance);
		// TODO Auto-generated constructor stub
	}

	public static void input() {
		String userName;
//		Integer Balance0;
//		String passWord;
//		String withDraw;
		String accountType1 = "";
//		String accountType2 = "";
		String deposit;
		String invalidLogin = "INVALID USERNAME";
		BankAppDAO bankAccount = new BankAccountDAOImpl();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Username: ");
		userName = input.nextLine().toString();
//		System.out.println(bankAccount.getBankAccount(userName));
		if (userName.equals("0001")||userName.equals("0002")||userName.equals("0003")) {
			System.out.println(bankAccount.getBankAccount(userName));
//			System.out.println(bankAccount.switchStatement());
			int x2 = 0;
//			I initialized the variable to 0 to incorporate an 
//			infinite loop until the logout button is entered
			Integer Balance1 = getCheckingBalance();
			Integer Balance2 = getSavingsBalance();
			while (x2 < 6) {
//			x2 < 6 is just a condition I set to help the infinite
//				Integer Balance1 = getCheckingBalance();
//				Integer Balance2 = getSavingsBalance();
				setCheckingBalance(Balance1);
				setSavingsBalance(Balance2);
				System.out.println(
						"========================================" +"\n"+
						"1. Balance " +"\n"+
						"2. Withdraw " +"\n"+
						"3. Deposit " +"\n"+
						"4. Register for another Account " +"\n"+
						"5. Logout" +"\n"+
						"========================================");
				String x;
				Scanner input2 = new Scanner(System.in);
				x = input2.nextLine().toString();
					switch(x){
					case "1": setCheckingBalance(Balance1);
				              setSavingsBalance(Balance2);
//							  Balance1 = getCheckingBalance();
//						      Balance2 = getSavingsBalance();
							  System.out.println("Checking: $" + Balance1);
							  System.out.println("Savings: $" + Balance2);
							  break;
					case "2": System.out.println("Withdraw");
						String withDraw;
//						if (accountType.equals)
						System.out.println("Enter the account you want to withdraw from");
						Scanner input3 = new Scanner(System.in);
						accountType1 = input3.nextLine().toString();
						if (accountType1.equals("Checking")||accountType1.equals("Savings")) {
							switch(accountType1) {
							case "Checking": System.out.println("Enter Withdraw amount: ");
											 Scanner input4 = new Scanner(System.in);
											 withDraw = input4.nextLine().toString();
											 Integer wD1 = Integer.valueOf(withDraw);
											 if (wD1 > Balance1) {
												 System.out.println("Withdraw amount exceeded balance");
												 continue;
											 }
											 Balance1 = Balance1 - wD1;
											 setCheckingBalance(Balance1);
											 System.out.println("REMAINING CHECKING BALANCE");
											 System.out.println("$" + Balance1);
											 break;
							case "Savings": System.out.println("Enter Withdraw amount: ");
											Scanner input5 = new Scanner(System.in);
											withDraw = input5.nextLine().toString();
											Integer wD2 = Integer.valueOf(withDraw);
											if (wD2 > Balance2) {
												System.out.println("Withdraw amount exceeded balance");
											}
											Balance2 = Balance2 - wD2;
											setSavingsBalance(Balance2);
											System.out.println("REMAINING SAVINGS BALANCE");
											System.out.println("$" + Balance2);
											break;
						}

// MAKE THE PREVIOUS SWITCH STATEMENT ANOTHER METHOD
						} else {
							System.out.println("Invalid Input");
							continue;
						}
						break;

					case "3": 
						System.out.println("Deposit"); 
						System.out.println("Enter the account you want to deposit to: ");
						Scanner input6 = new Scanner(System.in);
						accountType1 = input6.nextLine().toString();
						if (accountType1.equals("Checking")||accountType1.equals("Savings")) {
							switch(accountType1) {
							case "Checking": System.out.println("Enter Deposit amount: ");
											 Scanner input7 = new Scanner(System.in);
											 deposit = input7.nextLine().toString();
											 Integer dP1 = Integer.valueOf(deposit);
											 Balance1 = Balance1 + dP1;
											 setCheckingBalance(Balance1);
											 System.out.println("REMAINING CHECKING BALANCE");
											 System.out.println("$" + Balance1);
											 break;
							case "Savings": System.out.println("Enter Deposit amount: ");
											Scanner input8 = new Scanner(System.in);
											deposit = input8.nextLine().toString();
											Integer dP2 = Integer.valueOf(deposit);
											Balance2 = Balance2 + dP2;
											setSavingsBalance(Balance2);
											System.out.println("REMAINING SAVINGS BALANCE");
											System.out.println("$" + Balance2);
											break;
							} 

						} else {
							System.out.println("Invalid Input");
							continue;
						}
						break;
					case "4": System.out.println("Register for Another Account");
							  String name;
							  String lastName;
							  Scanner input8 = new Scanner(System.in);
							  name = input8.nextLine().toString();
							  Scanner input9 = new Scanner(System.in);
							  lastName = input9.nextLine().toString();
							  System.out.println("First Name: " + name);
							  System.out.println("Last Name: " + lastName);
							  System.out.println("PLEASE FIND THE NEAREST BANK TO FINISH REGISTRATION");
							  break;
					case "5": System.out.println("==LOGGED OUT==");
							  x2+=6;
							  break;
				}
			}
		} else {
			System.out.println(invalidLogin);
		}
//		public static String accountTypeSwitch() {
//			
//		}
	}
}