package com.demo.service;

import com.demo.model.Bank;

public class BankService{

	public Bank fetchBank() {
		Bank bank = new Bank();
		bank.setId(1L);
		bank.setName("SBI - State Bank Of India");
		return bank;
	}
	
	
}
