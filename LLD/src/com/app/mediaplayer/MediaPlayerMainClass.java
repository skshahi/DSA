package com.app.mediaplayer;

import java.util.Arrays;
import java.util.List;

public class MediaPlayerMainClass {

	public static void main(String[] args) {
		
		Media video=new Video("movie.mp4");
		Media audio=new Audio("song.mp3");
		Image image=new Image("picture.jpg");
		Media imageAdaptor=new ImageAdaptor(image);
		
		HighQualityMediaDecorator highQualityMediaDecorator = new HighQualityMediaDecorator(video);
		
		List<Media> mediaList=Arrays.asList(video,audio,imageAdaptor,highQualityMediaDecorator);
		MediaCollection mediaCollection = new MediaCollection(mediaList);
		
		mediaCollection.play();
		
		
		

	}

}
