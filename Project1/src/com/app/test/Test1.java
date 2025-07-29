package com.app.test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//under build on terrace take dinner build under umbrella under taker dining under build restaurant take
//word>=2 

public class Test1 {

	public static void main(String[] args) {
		
		//filter(name->name.matches("u")).map(n->n)
		
		String str="under build on terrace take dinner build under umbrella under taker dining under build restaurant take";
	 List<String> names = Stream.of(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	.entrySet().stream().filter(map->map.getValue()>=2).map(e->e.getKey()).filter(name->name.contains("u")).map(n->n).collect(Collectors.toList());
	 
	 System.out.println(names);
				
		

	}

}
