package com.java8.customer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
	
	public static Customer getCustomerByEmail(String email)
	{
		List<Customer> customers = EKartDatabase.getCustomers();
		Customer customerResult=null;
		try {
			customerResult = customers.stream()
					.filter(customer->customer.email.equals(email))
					.findAny().orElseThrow(()->new Exception("No Customer found"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customerResult;
	}
	public static void main(String[] args) {
		
		// "abc@gmail.com"
		Customer customer=new Customer(144, "pinkej", "abc@gmail.com", Arrays.asList("54654","79845"));
		
		//empty
		//of
		//ofnullable
		//Optional<Object> empty = Optional.empty();
		//System.out.println(empty);
		/*Optional<String> email = Optional.of(customer.email);
		System.out.println(email);*/
		Optional<String> email = Optional.ofNullable(customer.email);
		//System.out.println(email);
		/*if(email.isPresent())
		{
			System.out.println(email.get());
		}*/
		//System.out.println(email.orElse("dyummy"));
		//System.out.println(email.orElseThrow(()->new IllegalArgumentException("email not present")));
		//System.out.println(email.map(e->e.toUpperCase()).orElseGet(()->"Dummy Email"));
		System.out.println(OptionalDemo.getCustomerByEmail("sonu@gmail.com"));
	}

}
