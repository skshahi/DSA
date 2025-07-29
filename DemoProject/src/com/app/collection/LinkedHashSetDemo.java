package com.app.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> al=new LinkedHashSet<>();
		al.add(10);
		al.add(12);
		al.add(20);
		al.add(30);
		al.add(14);
		al.add(54);
		al.add(32);
		al.add(null);
		System.out.println(al);
		long estimateSize = al.spliterator().estimateSize();
		System.out.println(estimateSize);
		
		//al.forEach(i->System.out.println(i));
		

	}

}
