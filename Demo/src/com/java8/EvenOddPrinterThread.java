package com.java8;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrinterThread {
	private static Object obj=new Object();
	
	private static IntPredicate evenPredicate=i->i%2==0;
	private static IntPredicate oddPredicate=i->i%2!=0;
	
	public static void printNumber(IntPredicate intPredicate)
	{
		IntStream.rangeClosed(1, 10).filter(intPredicate).forEach(EvenOddPrinterThread::execute);
		
	}
	
	public static void execute(int no)
	{
		synchronized (obj) {
			System.out.println(Thread.currentThread().getName()+"-"+no);
			obj.notify();
			try {
				obj.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		CompletableFuture.runAsync(()->EvenOddPrinterThread.printNumber(evenPredicate));
		CompletableFuture.runAsync(()->EvenOddPrinterThread.printNumber(oddPredicate));
		Thread.sleep(1000);
		
	}

}
