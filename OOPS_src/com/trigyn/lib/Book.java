package com.trigyn.lib;

public class Book {
	private String title;
	private Member mbr;

	public Book(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void status() {
		if(mbr == null)
			System.out.println(title + " is not issued to anyone");
		else 
			System.out.println(title + " is issued by " + mbr.getName());
	}
	
	public void issueBook(Member m) {
		if(mbr == null && m.getBook() == null) {
			mbr=m;
			m.setBook(this);
		} else
			System.out.println(title + " cannot be issued to " +m.getName());
	}
	
	public void returnBook(Member m) {
		if(mbr != null && m.getBook() != null) {
			mbr=null;
			m.setBook(null);
		} else
			System.out.println(title + " is not issued to " +m.getName());
	}
}
