package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Example 14: using java8 streams api?
		List<String> names = Arrays.asList("Amit", "Deepa", "Rahul", "Akhil");
		Output should be shown as {A=[Amit, Akhil], D=[Deepa], R=[Rahul]}*/

public class GroupByFirstChar {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Amit", "Deepa", "Rahul", "Akhil");
		Map<Character, List<String>> collect = names.stream().collect(Collectors.groupingBy(name->name.toString().charAt(0)));
		
		//Map<Character, List<String>> collect2 = names.stream().collect(Collectors.groupingBy(name->name.toString().charAt(0)));
		System.out.println(collect);
		//System.out.println(collect2);
		

	}

}
