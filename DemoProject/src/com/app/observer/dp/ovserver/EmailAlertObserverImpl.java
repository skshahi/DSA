package com.app.observer.dp.ovserver;

import com.app.observer.dp.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

	String emailId;
	//has-a
	StockObservable stockObservable;
	public EmailAlertObserverImpl(String emailId,StockObservable stockObservable)
	{
		this.stockObservable=stockObservable;
		this.emailId=emailId;
		
	}
	
	@Override
	public void update() {
		sendMail(emailId,"Product is in stock harry up!");
		

	}
	private void sendMail(String emailId2, String message) {
		System.out.println("Mail sent to CLient:"+emailId2);
		
	}

}
