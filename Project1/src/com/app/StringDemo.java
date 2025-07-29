package com.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@FunctionalInterface
interface I1{
	void m1();
}

@FunctionalInterface
interface I2 extends  I1{
	void m1();
}

public class StringDemo {

	public static void main(String[] args) {
		String str1="test1";
		String str2="test2";
		System.out.println(str2.equals(str1=str2));
		
		List<Integer> al=Arrays.asList(2,1,3,1,5,6,4,9,8,8,9,1,2);
		
		Set<Integer> set=new HashSet<>();
		Set<Integer> collect = al.stream().filter(i->!set.add(i)).collect(Collectors.toSet());
		System.out.println(collect);
		
		Set<Integer> duplicate = al.stream().filter(i->Collections.frequency(al, i)>1).collect(Collectors.toSet());
		
		System.out.println(duplicate);

	}

}
