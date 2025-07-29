package com.app.texteditor;

public interface TextEditorSubject {
	
	//register the observers
	
	void registerObserver(TextEditorObserver observer);
	//remove the observers
	
	void removeObserver(TextEditorObserver observer);
	//notify the observers
	void notifyMe();
	

}
