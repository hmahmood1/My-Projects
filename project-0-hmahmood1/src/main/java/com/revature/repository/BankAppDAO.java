package com.revature.repository;

import java.util.List;

import com.revature.model.BankAccount;

public interface BankAppDAO {

	BankAccount getBankAccount(String userName);
	BankAccount getBankAccount(int age);
	boolean createBankAccount(BankAccount bankAccount);
	boolean updateBankAccount(BankAccount bankAccount);
	List<BankAccount> getBankAccount();
}