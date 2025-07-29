package com.app.texteditor;

import java.util.ArrayList;
import java.util.List;

public class TextEditor implements TextEditorSubject {

	List<TextEditorObserver> observers=new ArrayList<>();
	private String currentText="";
	@Override
	public void registerObserver(TextEditorObserver observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(TextEditorObserver observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyMe() {
		for(TextEditorObserver observer:observers)
		{
			observer.update(this.currentText);
			
		}
		
	}

	public void setCurrentText(String currentText) {
		this.currentText = currentText;
	}

	public String getCurrentText() {
		return currentText;
	}
	
	

	

}
