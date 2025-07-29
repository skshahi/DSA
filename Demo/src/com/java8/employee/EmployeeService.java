package com.java8.employee;

import java.util.List;

import java.util.stream.Collectors;

public class EmployeeService {

	public static List<Employee> getTaxableEmp()
	{
		return new EmployeeDAO().getEmployees().stream()
				.filter(emp->emp.getSalary()>150).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println(getTaxableEmp());
	}
}
