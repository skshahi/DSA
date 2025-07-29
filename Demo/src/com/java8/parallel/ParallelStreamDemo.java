package com.java8.parallel;

import java.util.stream.IntStream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		long start=0;
		long end=0;
		
		start=System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("Plain Stream Time Took:"+(end-start));
		
		System.out.println("***********************************************");
		start=System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::println);;
		end=System.currentTimeMillis();
		System.out.println("Plain Stream Time Took:"+(end-start));
		
	

	}

}
