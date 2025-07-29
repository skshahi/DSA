package com.java8.mapreduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {
	
	public static List<Employee> getEmployees()
	{
		return Stream.of(
				new Employee(101, "Sonu", "A", 560),
				new Employee(102, "Atul", "B", 450),
				new Employee(103, "Vivaan", "A", 750),
				new Employee(104, "Shivam", "C", 350),
				new Employee(105, "Aman", "A", 950),
				new Employee(106, "Angad", "B", 450)
				
				).collect(Collectors.toList());
	}

}
