package com.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionDemo {

	public static void main(String[] args) {
		//System.out.println((int)Math.floor(Math.random()*10));
		Function<String ,Integer> f=s->s.length();
		System.out.println(f.apply("sonu"));
		Predicate<Integer> p1=e->e%2==0;
		Predicate<Integer> p2=e->e>10;
		System.out.println(p1.and(p2).test(12));
		System.out.println(p1.or(p2).test(11));
		System.out.println(p1.negate().test(2));
		Consumer<String> c=e->System.out.println(e);
		c.accept("Atul");
		Supplier<Integer> s=()->(int)Math.floor(Math.random()*10);
		Supplier<Integer> random= ()->(int)(Math.random() * 6) + 1;
		System.out.println(s.get());
		System.out.println(random.get());
		
		

	}

}
