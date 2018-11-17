package com.trigyn.stock;

public class TestStock {
	public static void main(String[] args) {
		Holder h = StockSingleton.getStock();
		h.viewQuote();
		Broker b = StockSingleton.getStock();
		b.viewQuote();
		b.getQuote();
		
		System.out.println(h==b);

	}

}
