package com.trigyn.bank;

public abstract class Account implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	
	private static int autogen = INIT_ACNT_NO;
	
	public Account() {
		}

	public Account(String holder, double balance) {
		this.acntNo = autogen ++;
		this.holder = holder;
		this.balance = balance;
	}
	public void summary() {
		System.out.println("A/C No: "  +acntNo);
		System.out.println("Holder: "  +holder);
		System.out.println("Balance: "  +balance);
	}
	//BL methods
	public void deposit(double amount) {	
		balance+=amount;
	}
	
//	public abstract void withdraw(double amount); //The purpose of abstract method is to achieve polymorphism
	//Here we do not need the implementation of withdraw but we do need the declaration in TestACc
	//hence abstract.
	
//		if (amount<=balance) {
//			balance-=amount;
//		}
//		else
//			System.out.println("insufficient funds!");
	
	public double getBalance() {
		return balance;
	}
	
}
