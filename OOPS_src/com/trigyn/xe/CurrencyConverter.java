package com.trigyn.xe;

public class CurrencyConverter {
	public double convert(Currency source, Currency target, double amount) {
		double price = target.dollarValue() / source.dollarValue();
		return price * amount;
	}


}
