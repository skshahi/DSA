package com.app;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstNonRepeatingElement {

	public static void main(String[] args) {
		String str="ghgbdsajdgjsg";
	String key = Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream()
		.filter(i->i.getValue()==1).findFirst().get().getKey();
	
	System.out.println("First Non repeating char:"+key);
	String firstRepeatChar = Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
			.entrySet().stream()
			.filter(i->i.getValue()>1).findFirst().get().getKey();
		
		System.out.println("First  repeating char:"+firstRepeatChar);
		

	}

}
