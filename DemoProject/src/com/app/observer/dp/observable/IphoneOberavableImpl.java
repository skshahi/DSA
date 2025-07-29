package com.app.observer.dp.observable;

import java.util.ArrayList;
import java.util.List;

import com.app.observer.dp.ovserver.NotificationAlertObserver;

public class IphoneOberavableImpl implements StockObservable {

	List<NotificationAlertObserver> observerList=new ArrayList<>();
	int stockCount=0;
	@Override
	public void add(NotificationAlertObserver observer) {
		observerList.add(observer);

	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		observerList.remove(observer);

	}

	@Override
	public void notifySubscriber() {
		for(NotificationAlertObserver observer:observerList)
		{
			observer.update();
		}

	}

	@Override
	public void setStockCount(int newStockAdded) {
		if(newStockAdded==8)
		{
			notifySubscriber();
		}
		stockCount=stockCount+newStockAdded;

	}

	@Override
	public int getStockCount() {
		
		return stockCount;
	}

}
