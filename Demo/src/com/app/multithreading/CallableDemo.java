package com.app.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SumValue implements Callable<Object>{
int value;
public SumValue(int value) {
	this.value=value;
}

	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName() +" is responsibl to find the Sum of "+value+" numbers.");
		int sum=0;
		for(int i=1;i<=value;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
	
}

public class CallableDemo {

	public static void main(String[] args) {
		SumValue[] values={
				new SumValue(10),
				new SumValue(30),
				new SumValue(50),
				new SumValue(40),
				new SumValue(60)
		};
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(SumValue val:values)
		{
			Future<Object> submit = service.submit(val);
			try {
				System.out.println(submit.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		service.shutdown();
		

	}

}
