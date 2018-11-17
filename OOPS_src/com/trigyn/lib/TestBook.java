package com.trigyn.lib;

public class TestBook {
	public static void main(String[] args) {
		Member mbr = new Member("John");
		Book bk = new Book("The Alchemist");
		
		mbr.status();
		bk.status();
		
		bk.returnBook(mbr);
		
		System.out.println("--After issue of Book");
		bk.issueBook(mbr);
		
		mbr.status();
		bk.status();
		
		bk.issueBook(mbr);
		
		System.out.println("--After returning of Book");
		bk.returnBook(mbr);
		
		mbr.status();
		bk.status();
	}
}
