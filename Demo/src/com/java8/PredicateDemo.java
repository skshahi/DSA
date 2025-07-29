package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> p=(i)->{
			return i%2==0?true:false;
		};
		
		Predicate<Integer> p1=(i)->i%2==0;
		
		System.out.println(p.test(6));
		System.out.println(p1.test(6));
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		list.stream().filter(p1).forEach(n->System.out.println("Even:"+n));

	}

}
