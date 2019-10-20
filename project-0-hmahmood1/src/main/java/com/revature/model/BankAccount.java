package com.revature.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BankAccount {

	private String account_id;
	private String firstName;
	private String lastName;
	private static int checkingBalance;
	private static int savingsBalance;
//	private String customerSince;
//	private long age;
//	private String address;
//	private String cityState;
	
	public BankAccount(String account_id, String firstName, String lastName, int checkingBalance, int savingsBalance) {
		super();
		this.account_id = account_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
//		this.customerSince = customerSince;
//		this.age = age;
//		this.address = address;
//		this.cityState = cityState;
	}
	
	public BankAccount(ResultSet resultSet) throws SQLException {
		this(resultSet.getString("ACCOUNT_ID"),
		resultSet.getString("FIRST_NAME"),
		resultSet.getString("LAST_NAME"),
		resultSet.getInt("BALANCE_CHECKING"),
		resultSet.getInt("BALANCE_SAVINGS"));
//		resultSet.getString("CUSTOMER_SINCE"),
//		resultSet.getLong("age"),
//		resultSet.getString("address"),
//		resultSet.getString("CITY_STATE"));
	}

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public static int getCheckingBalance() {
		return checkingBalance;
	}
	
	public static void setCheckingBalance(int checkingBalance) {
		checkingBalance = checkingBalance;
	}
	
	public static int getSavingsBalance() {
		return savingsBalance;
	}

	public static void setSavingsBalance(int savingsBalance) {
		savingsBalance = savingsBalance;
	}
	
	@Override
	public String toString() {
		return "BankAccount [Account Id: " + account_id + " First Name: " + firstName + " Last Name: " + lastName
				+ " Checking Balance: " + checkingBalance + " Savings Balance: " + savingsBalance + "]";
	}

//	public String getCustomerSince() {
//		return customerSince;
//	}
//
//	public void setCustomerSince(String customerSince) {
//		this.customerSince = customerSince;
//	}
//
//	public long getAge() {
//		return age;
//	}
//
//	public void setAge(long age) {
//		this.age = age;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getCityState() {
//		return cityState;
//	}
//
//	public void setCityState(String cityState) {
//		this.cityState = cityState;
//	}
}