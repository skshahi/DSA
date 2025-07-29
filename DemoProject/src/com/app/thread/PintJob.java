package com.app.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Job implements Runnable {
	String wish;

	
	Job(String wish)
	{
		this.wish=wish;

	}
	
	void printJob()
	{
		System.out.println(wish);
	}

	@Override
	public void run() {
		System.out.println("Current Thread Name:"+Thread.currentThread().getName());
		printJob();
		
	}
}

public class PintJob {

	public static void main(String[] args) {
		Job[]jobs={new Job("Good Morning"),
				new Job("Good Morning"),
				new Job("Good AfterNoon"),
				new Job("Good Morning"),
				new Job("Good Night"),
				new Job("Good Noon"),
				new Job("Good Morning"),
				new Job("Good Luck")
				
				};
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(Job job:jobs)
		{
			Future<?> submit = service.submit(job);
			try {
				System.out.println(submit.get());
				System.out.println(submit.isDone());
				System.out.println(submit.getClass().getName());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
