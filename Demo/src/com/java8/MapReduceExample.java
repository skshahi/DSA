package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.java8.mapreduce.EmployeeDatabase;

public class MapReduceExample {

	public static void main(String[] args) {
		List<String> langList = Arrays.asList("Spring","Java","hibernate");
		List<Integer> asList = Arrays.asList(4,5,7,8,9,3);
	/*	
		List<String> langList = Arrays.asList("Spring","Java","hibernate");
		
		//way1
		int sum=0;
		for(int num:asList)
		{
			sum+=num;
		}
		System.out.println(sum);
		
		//way2
		int sumNum = asList.stream().mapToInt(i->i).sum();
		System.out.println(sumNum);
		//way3
		
		Integer reduce = asList.stream().reduce(0, (a,b)->a+b);
		System.out.println(reduce);
		//way4
		Optional<Integer> reduce2 = asList.stream().reduce(Integer::sum);
		System.out.println(reduce2.get());
		Optional<Integer> maxValue = asList.stream().reduce(Integer::max);
		System.out.println(maxValue.get());*/
		
		//find longest String in list
		String longestValue = langList.stream()
				.reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
		System.out.println(longestValue);
		
		double avgSalary = EmployeeDatabase.getEmployees().stream().filter(emp->emp.getGrade().equalsIgnoreCase("A"))
		.map(emp->emp.getSalary())
		.mapToInt(i->i)
		.average().getAsDouble();
		
		System.out.println(avgSalary);
		
		double sumSalary = EmployeeDatabase.getEmployees().stream().filter(emp->emp.getGrade().equalsIgnoreCase("A"))
				.map(emp->emp.getSalary())
				.mapToInt(i->i)
				.sum();
		System.out.println(sumSalary);
		

	}

}
