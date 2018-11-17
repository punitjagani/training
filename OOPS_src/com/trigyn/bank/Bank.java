package com.trigyn.bank;

public interface Bank {
	int INIT_ACNT_NO = 1001; //good practise, for better readibility
	
	double MIN_SAV_BAL = 1000;
	double INIT_CUR_BAL = 5000;
	double MIN_CUR_BAL = 0;
	double OD_LIMIT = 10000;
	
	void deposit(double amount);
	void withdraw(double amount) throws BalanceException;
	void summary();
	double getBalance();
}
