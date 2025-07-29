package com.java8.customer;

import java.util.List;
import java.util.stream.Collectors;

public class MapVSFlatMap {

	public static void main(String[] args) {
		List<Customer> listCust = EKartDatabase.getCustomers();

		// List<Customer> convert List<String> : Data transformation
		// mapping: Customer->customer.getEmail : one to one mapping
		List<String> emails = listCust.stream()
				              .map(customer -> customer.getEmail())
				              .collect(Collectors.toList());
		System.out.println(emails);
		//Data transformation + flattering
		//customer->customer.getPhoneNumber() : one to many mapping
		List<List<String>> phoneNumbers = listCust.stream()
				.map(customer->customer.getPhoneNumber())
				.collect(Collectors.toList());
		System.out.println(phoneNumbers);
		
		List<String> flatMapingPhoneNumbers = listCust.stream()
				.flatMap(customer->customer.getPhoneNumber().stream())
				.collect(Collectors.toList());
		System.out.println(flatMapingPhoneNumbers);

	}

}
