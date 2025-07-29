package com.app.texteditor;

public class LowercaseStrategy implements TextFormattingStrategy {

	@Override
	public String format(String text) {
		System.out.println("We are formating text to lowercase");
		return text.toLowerCase ();
	}

}
