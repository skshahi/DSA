package com.app.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToSet {

	public static void main(String[] args) {
		List<Integer>al=Arrays.asList(14,15,12,17,25,69);
		
		 Map<Integer, Long> map = al.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		
		

	}

}
