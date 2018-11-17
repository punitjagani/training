package com.trigyn.bank;
public final class AccountFactory { //final so that no one can inherit this class
	
	private AccountFactory() { //here we made a default constructor private coz we do not want anyone to instantiate this class
		
	}
	
	public static Bank openAccount(String holder, String type) {
	Bank acnt = null;
	if(type.equalsIgnoreCase("Savings"))
		acnt= new Savings(holder);
	else
		acnt = new Current(holder);
	
	return acnt;
	}
}
