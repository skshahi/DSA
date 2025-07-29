package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java8.employee.Employee;
import com.java8.employee.EmployeeDAO;

public class ListSorteedDemo {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(25);
		l.add(15);
		l.add(5);
		l.add(20);
		l.add(10);
		l.add(35);
		/*l.sort((i,j)->j.compareTo(i));
		System.out.println(l);*/
		/*Collections.sort(l);
		Collections.reverse(l);*/
		
		/*l.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(action->System.out.println(action));*/
		
		List<Employee> empList=EmployeeDAO.getEmployees();
		//System.out.println(empList);
		//System.out.println(empList.stream().distinct().collect(Collectors.toList()));
		//sort emp based on salary
		/*Collections.sort(empList, (o1,o2)->(int)(o2.getSalary()-o1.getSalary()));
		System.out.println(empList);*/
		//
		
		/*empList.stream()
		.sorted(Comparator.comparing(emp->emp.getSalary()))
		.forEach(System.out::println);*/
		
		/*empList.stream()
		.sorted(Comparator.comparing(emp->(int)emp.getSalary(), (e1,e2)->e2-e1))
		.forEach(System.out::println);*/
		
		empList.stream()
		.sorted(Comparator.comparing(Employee::getName, (e1,e2)->e2.compareTo(e1)))
		.forEach(System.out::println);
		
		
		
		
		}

}
