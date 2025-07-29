package com.app.mediaplayer;

public class Audio implements Media {
	
	private String  filename;
	

	public Audio(String filename) {
		this.filename = filename;
	}


	@Override
	public void play() {
		System.out.println("Play audio file:"+filename);
		

	}

}
