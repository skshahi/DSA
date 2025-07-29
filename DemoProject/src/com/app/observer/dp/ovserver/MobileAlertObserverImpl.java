package com.app.observer.dp.ovserver;

import com.app.observer.dp.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

	String userName;
	//has-a
	StockObservable stockObservable;
	public MobileAlertObserverImpl(String userName,StockObservable stockObservable)
	{
		this.stockObservable=stockObservable;
		this.userName=userName;
		
	}
	
	@Override
	public void update() {
		sendMessage(userName,"Product is in stock harry up!");
		

	}
	private void sendMessage(String userName, String message) {
		System.out.println("Message sent to Client:"+userName);
		
	}
	

}
