package com.app.observer.dp.observable;

import com.app.observer.dp.ovserver.NotificationAlertObserver;

public interface StockObservable {
	
	public void add(NotificationAlertObserver observer);
	public void remove(NotificationAlertObserver observer);
	public void notifySubscriber();
	public void setStockCount(int newStockAdded);
	public int getStockCount();

}
