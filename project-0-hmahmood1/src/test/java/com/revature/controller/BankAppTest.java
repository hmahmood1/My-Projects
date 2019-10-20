package com.revature.controller;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.revature.model.BankAccount;
import com.revature.repository.BankAccountDAOImpl;
import static org.junit.Assert.*;

public class BankAppTest  {

	public static Logger log = Logger.getLogger(Controller.class);
//	public static BankAccount testbankAccount = new BankAccountDAOImpl();
	
	
	@Test
	public void insufficientFunds() {
		log.debug("test: The amount needed exceeds the amount in the account");
//		assertFalse(BankAccountDAOImpl.bankAccount)
	}
	
}
