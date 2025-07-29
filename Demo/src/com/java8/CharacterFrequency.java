package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class CharacterFrequency {

	public static void main(String[] args) {
		String name="sonukumara";
		
	Map<String,Long>map=Arrays.stream(name.split(""))
		.collect(
				Collectors.groupingBy(Function.identity(), Collectors.counting())
				
				);
	//
	System.out.println(map);
	
	///Find highest paid emp based on dept
	List<EmployeeDept> empDeptList= Stream.of(
			new EmployeeDept(101, "A", "DEV", 10400),
			new EmployeeDept(101, "B", "QA", 10300),
			new EmployeeDept(101, "C", "DEVOPS", 100000),
			new EmployeeDept(101, "D", "DEV", 100000),
			new EmployeeDept(101, "E", "QA", 100400),
			new EmployeeDept(101, "G", "DEV", 1010000)
			).collect(Collectors.toList());	
	   //  System.out.println(empDeptList);
	     
	     Map<String, List<EmployeeDept>> empGroupByDept = empDeptList.stream()
	    		 .collect(Collectors.groupingBy(EmployeeDept::getDept));
	    // System.out.println(empGroupByDept);
	     
	     //way1
	     Comparator<EmployeeDept> compareBySalary = Comparator.comparing(EmployeeDept::getSalary);
	     Map<String, Optional<EmployeeDept>> mapByHighSalary = empDeptList.stream()
		 .collect(
				 Collectors.groupingBy(
						 EmployeeDept::getDept,
						 Collectors.reducing(
								 BinaryOperator.maxBy(compareBySalary))));
	     
	    // System.out.println(mapByHighSalary);
	     
	     //way2
	     Map<String, EmployeeDept> empMapByHighSalary = empDeptList.stream()
	     .collect(Collectors.groupingBy(
	    		 EmployeeDept::getDept, 
	    		 Collectors.collectingAndThen(
	    				 Collectors.maxBy(
	    						 Comparator.comparingDouble(EmployeeDept::getSalary)), Optional::get)));
	     
	     System.out.println(empMapByHighSalary);
	     
	

	}

}
