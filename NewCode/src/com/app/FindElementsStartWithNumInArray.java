package com.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementsStartWithNumInArray {

	public static void main(String[] args) {
	int []arr= {5,9,11,2,8,21,1};
	List<String> collect = Arrays.stream(arr).boxed().map(e->e+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
	
	System.out.println(collect);
	
	
	List<String> asList = Arrays.asList("1","2","3","4");
	//1->2->3->
	
	String join = String.join("->", asList);
	System.out.println(join);

	}

}
