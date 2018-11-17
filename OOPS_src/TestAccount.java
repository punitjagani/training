

import com.trigyn.bank.AccountFactory;
import com.trigyn.bank.BalanceException;
import com.trigyn.bank.Bank;

public class TestAccount {
	public static void main(String[] args) {
		Bank c1 = AccountFactory.openAccount("Lili", "Current");
		c1.deposit(1500);
		c1.summary();
		try {
			c1.withdraw(18000);
		} catch (BalanceException e) {
			//e.printStackTrace(); //trouble shooting - developers
			//System.out.println(e); //logging - audit
			System.out.println(e.getMessage()); //end user
		}
		//System.out.println();
		//c1.deposit(18000);
	}
}
