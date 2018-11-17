package com.trigyn.xe;

public class TestCurrency {
	public static void main(String[] args) {
		INR inr = new INR();
		USD usd = new USD();
		AED aed = new AED();
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println(cc.convert(inr, usd, 6550));
		System.out.println(cc.convert(usd, inr, 100));
		System.out.println(cc.convert(usd, aed, 100));


	}

	
}
