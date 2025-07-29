package com.app;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service=Executors.newFixedThreadPool(10);
		Future<List<Integer>> submit = service.submit(()->{
			System.out.println("Currnt Thread:"+Thread.currentThread().getName());
			
			return Arrays.asList(1,2,3,4,5,6);
		});
		System.out.println(submit.get());;
		
		CompletableFuture< String> completableFuture=new CompletableFuture<>();
		completableFuture.get();
		completableFuture.complete("done");

	}
	

}
