package com.app.observer.dp;

import com.app.observer.dp.observable.IphoneOberavableImpl;
import com.app.observer.dp.observable.StockObservable;
import com.app.observer.dp.ovserver.EmailAlertObserverImpl;
import com.app.observer.dp.ovserver.MobileAlertObserverImpl;
import com.app.observer.dp.ovserver.NotificationAlertObserver;

public class Store {

	public static void main(String[] args) {
		StockObservable iphoneStockObseravable=new IphoneOberavableImpl();
		NotificationAlertObserver n1=new EmailAlertObserverImpl("sonu@gmail.com",iphoneStockObseravable);
		NotificationAlertObserver n2=new MobileAlertObserverImpl("sonu2025",iphoneStockObseravable);
		
		iphoneStockObseravable.add(n1);
		iphoneStockObseravable.add(n2);
		iphoneStockObseravable.setStockCount(10);

	}

}
