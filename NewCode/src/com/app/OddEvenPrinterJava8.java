package com.app;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class OddEvenPrinterJava8 {
	private static Object object =new Object();
	private static IntPredicate even=e->e%2==0;
	private static IntPredicate odd=e->e%2!=0;
	
	public static void execute(int no)
	{
		synchronized (object) {
			System.out.println(Thread.currentThread().getName()+": "+no);
			object.notify();
			try {
				object.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void print(IntPredicate con)
	{
		IntStream.rangeClosed(1,10).filter(con).forEach(OddEvenPrinterJava8::execute);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		CompletableFuture.runAsync(()->OddEvenPrinterJava8.print(even));
		CompletableFuture.runAsync(()->OddEvenPrinterJava8.print(odd));
		Thread.sleep(1000);
		

	}

}
