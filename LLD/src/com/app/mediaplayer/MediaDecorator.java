package com.app.mediaplayer;

public abstract class MediaDecorator implements Media {

	protected Media decoratedMedia;
	
	public MediaDecorator(Media decoratedMedia) {
		this.decoratedMedia = decoratedMedia;
	}

	@Override
	public void play() {
		this.decoratedMedia.play();
		

	}

}
