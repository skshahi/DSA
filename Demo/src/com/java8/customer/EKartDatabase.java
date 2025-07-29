package com.java8.customer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EKartDatabase {
	
	public static List<Customer> getCustomers()
	{
		return Stream.of(
				new Customer(101, "Sonu", "sonu@gmail.com", Arrays.asList("7849","5645")),
				new Customer(102, "Atul", "atul@gmail.com", Arrays.asList("7898","56045")),
				new Customer(103, "Vivaan", "vivaan@gmail.com", Arrays.asList("6789","5645")),
				new Customer(105, "Shivam", "shivam@gmail.com", Arrays.asList("7889","56645")),
				new Customer(109, "Aman", "aman@gmail.com", Arrays.asList("7899","65645")),
				new Customer(107, "Anagad", "angad@gmail.com", Arrays.asList("7839","56145"))
				
				
				).collect(Collectors.toList());
	}

}
