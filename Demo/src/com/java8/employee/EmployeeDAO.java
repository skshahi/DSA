package com.java8.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	public static List<Employee> getEmployees()
	{
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(101, "sonu", "CS", 15));
		empList.add(new Employee(101, "sonu", "CS", 15));
		empList.add(new Employee(102, "atul", "EC", 150));
		empList.add(new Employee(103, "vivaan", "IAS", 550));
		empList.add(new Employee(104, "shivam", "CE", 15));
		empList.add(new Employee(105, "aman", "IPS", 350));
		return empList;
	}

}
