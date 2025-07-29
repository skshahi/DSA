package com.app;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

class OddEventhread implements Callable{
	
	ReentrantLock rLock=new ReentrantLock();
		
	 int  oddSum=0,evenSum=0;
	 String name;
	 

	public OddEventhread(String name) {
		super();
		this.name = name;
	}


	@Override
	public Object call() throws Exception {
		for(int i=1;i<=10;i++)
		{
			//System.out.println("vivaan");
			
			
			if(i%2==0 )
			{
				rLock.lock();
				
				System.out.println("Even:"+Thread.currentThread().getName());
				evenSum+=i;
				rLock.unlock();
				
			}
			//rLock.unlock();
			if(i%2!=0)
			{
				rLock.lock();
				System.out.println("Odd:"+Thread.currentThread().getName());
			oddSum+=i;
			rLock.unlock();
				
			}
			
		}
		System.out.println(evenSum+"="+oddSum);
		
		return evenSum+oddSum;
	}
}

public class OddEvenSum {

	public static void main(String[] args) {
		OddEventhread t1=new OddEventhread("even");
		OddEventhread t2=new OddEventhread("odd");
		
		
		
		
		OddEventhread[] jobs= {t1,t2};
		ExecutorService service=Executors.newFixedThreadPool(2);
		for(OddEventhread t:jobs)
		{
		Future<OddEventhread> submit = service.submit(t);
		try {
			System.out.println(submit.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		service.shutdown();
		
		
		
		
		
		
		
		
		
		

	}

}
