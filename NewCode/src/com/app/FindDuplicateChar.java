package com.app;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateChar {

	public static void main(String[] args) {
		String str="ghgdsajdgjsg";
		List<String> collect = Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream()
		.filter(i->i.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList())
		;
		
		System.out.println(collect);
		

	}

}
