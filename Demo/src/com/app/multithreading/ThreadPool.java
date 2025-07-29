package com.app.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable
{
	String name;
	public PrintJob(String name) {
		this.name=name;
		
	}
	
	

	@Override
	public void run() {
		System.out.println(name+" Job started by thread "+Thread.currentThread().getName());
		try{
			Thread.sleep(1000);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(name+" Job completed by thread "+Thread.currentThread().getName());
		
	}
	
}

public class ThreadPool {

	public static void main(String[] args) {
		PrintJob jobs[]={
				new PrintJob("Sonu"),
				new PrintJob("Atul"),
				new PrintJob("Vivaan"),
				new PrintJob("Shivam"),
				new PrintJob("Aman"),
				new PrintJob("Angad")
		};
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(PrintJob job:jobs)
		{
			service.submit(job);
		}
		service.shutdown();
		

	}

}
