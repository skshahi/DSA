package com.app.java8;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo1 {
	
	static void m1(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
	BiConsumer<Integer,Integer>	sum=Demo1::m1;
	sum.accept(40, 20);
	
	
	Predicate<Integer> p1=(o)->o>5;
	Predicate<Integer> p2=(o)->o%2==0;
	System.out.println(p1.and(p2).test(11));
	System.out.println(p1.or(p2).test(11));
	System.out.println(p1.negate().test(11));
	
	Function<String,Integer> f=(s)->s.length()*2;
	System.out.println(f.apply("sonu"));

	}

}
