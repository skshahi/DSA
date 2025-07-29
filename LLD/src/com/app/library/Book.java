package com.app.library;

public class Book implements LibraryItem {
	
	private String uniqueId;
	private String title;
	private String author;
	private double value;
	
	
	
	

	public Book(String uniqueId, String title, String author, double value) {
		super();
		this.uniqueId = uniqueId;
		this.title = title;
		this.author = author;
		this.value = value;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return this.title;
	}

	@Override
	public String getUniqueId() {
		// TODO Auto-generated method stub
		return this.uniqueId;
	}

	@Override
	public int calculateLateFee(int days) {
		// TODO Auto-generated method stub
		return days*10;
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}

}
