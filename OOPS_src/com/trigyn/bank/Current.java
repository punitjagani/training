package com.trigyn.bank;

public class Current extends Account {
	private double overdraft;
    double x;
	public Current() {
	}

	public Current(String holder) {
		super(holder,INIT_CUR_BAL); //good practise, for better readibility
		this.overdraft = OD_LIMIT;	//good practise, for better readibility elsewhere as well
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft:" +overdraft);
	}

	@Override
	public void deposit(double amount) {
		if(overdraft<10000) {
			if(amount+overdraft<=OD_LIMIT) {
				overdraft+=amount;
			}
			else {
				x=OD_LIMIT-overdraft;
				overdraft+=x;
				balance=amount-x;
			}
		}
		else
			balance+=amount;
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if((balance+overdraft)>amount) {
			if(balance>amount){
				balance-=amount;	  
			}
			else {
				overdraft=overdraft+balance-amount;
				balance=MIN_CUR_BAL;
			}
		}
		else
			throw new BalanceException("Insufficient Funds");
	}
	
	

}
