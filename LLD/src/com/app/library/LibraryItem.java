package com.app.library;

public interface LibraryItem extends LateFeeCalculator {
	
	String getTitle();
	String getUniqueId();
	double getValue();

}
