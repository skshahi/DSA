package com.app.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(14);
		al.add(45);
		al.add(20);
		al.add(36);
		al.add(23);
		al.add(21);
		al.add(35);
		al.add(27);
		System.out.println(al);
		boolean anyMatch = al.stream().anyMatch(a->a%2==0);
		boolean noneMatch = al.stream().noneMatch(i->i!=100);
		System.out.println(anyMatch);
		System.out.println(noneMatch);
		List<Integer> even = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(even);
		List<Integer> sqrt = al.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(sqrt);
		

	}

}
