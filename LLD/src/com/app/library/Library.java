package com.app.library;

public class Library {
	
	LibraryItem[] items;
	
	
	public Library(LibraryItem[] items) {
		
		this.items = items;
	}


	public double calculatetotalValue()
	{
		double totalValue=0;
		
		for(LibraryItem item:items)
		{
			totalValue+=item.getValue();
		}
		return totalValue;
		
	}

}
