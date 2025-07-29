package com.app.texteditor;

public class TextEditorApp {

	public static void main(String[] args) {
		//Need to create the text editor
		TextEditor textEditor=new TextEditor();
		//text editor observers
		TextEditorObserver observer=new TextConsoleObserver();
		//register all the  observer with text editor
		textEditor.registerObserver(observer);
		textEditor.setCurrentText("Hello Sonu");
		
		
		//formatters
		TextFormattingStrategy uppercaseStrategy = new UppercaseStrategy();
		
		//command to create the text
		TextEditorCommand command=
				new FormatTextCommand(
						uppercaseStrategy, textEditor, textEditor.getCurrentText());
		
		command.execute();
		
		textEditor.notifyMe();
		

	}

}
