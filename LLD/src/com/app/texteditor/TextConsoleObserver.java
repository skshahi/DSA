package com.app.texteditor;

public class TextConsoleObserver implements TextEditorObserver {

	@Override
	public void update(String text) {
		System.out.println("The updated in console:"+text);

	}

}
