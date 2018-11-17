package com.trigyn.bank;

public class Savings extends Account {

	public Savings() {
	}

	public Savings(String holder) {
		super(holder, MIN_SAV_BAL);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount<=(balance - MIN_SAV_BAL))
			balance-= amount;
		else
			throw new BalanceException("Insufficient Funds!");
	}

}
