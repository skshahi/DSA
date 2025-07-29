package com.app.mediaplayer;

public class HighQualityMediaDecorator extends MediaDecorator {

	public HighQualityMediaDecorator(Media decoratedMedia) {
		super(decoratedMedia);
	}
	
	public void play()
	{
		super.play();
		System.out.println("Enhancing playback quality.");
	}

}
