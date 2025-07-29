package com.app;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable
{
	
	int num;
	MyCallable(int  num)
	{
		this.num=num;
	}
	public Object call() throws Exception
	{
		System.out.println("current-"+Thread.currentThread().getName());
		int evenSum=0;
		int oddSum=0;
		
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				evenSum=evenSum+i;
			}else {
				oddSum=oddSum+i;
			}
		}
		
		System.out.println("Even Sum:"+evenSum+"  Odd Sum:"+oddSum);
		return evenSum+oddSum;
		
	}
}

public class ExecutorDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable myCall1=new MyCallable(10);
		MyCallable myCall2=new MyCallable(10);
		MyCallable []myCalls= {myCall1,myCall2};
		ExecutorService service=Executors.newFixedThreadPool(2);
		for(MyCallable myCall:myCalls)
		{
		Future<MyCallable> submit = service.submit(myCall);
		System.out.println(submit.get());
		}
		
		service.shutdown();

	}

}
