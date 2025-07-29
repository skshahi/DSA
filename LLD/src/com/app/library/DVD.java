package com.app.library;

public class DVD implements LibraryItem {
	private String uniqueId;
	private String title;
	private String artist;
	private double value;
	
	

	public DVD(String uniqueId, String title, String artist, double value) {
		super();
		this.uniqueId = uniqueId;
		this.title = title;
		this.artist = artist;
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
		return days*15;
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}

}
