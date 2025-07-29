package com.app.texteditor;

public class UppercaseStrategy implements TextFormattingStrategy {

	@Override
	public String format(String text) {
		System.out.println("We are formating text to uppercase");
		return text.toUpperCase();
	}

}
