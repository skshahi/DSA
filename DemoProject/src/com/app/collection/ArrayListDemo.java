package com.app.collection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(1, 12);
		al.add(20);
		al.add(30);
		al.add(14);
		al.add(54);
		al.add(32);
		System.out.println(al);
		System.out.println(al.contains(14));
		System.out.println();
		char[] charArray = al.toString().toCharArray();
		
		
//		Iterator<Integer> iterator = al.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}
		
		System.out.println("----------------------");
		System.out.println(al.size());
		
		ListIterator<Integer> listIterator = al.listIterator();
		System.out.println(listIterator.hasNext());
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
//		al.sort(Collections.reverseOrder());  
		Collections.sort(al);
		System.out.println(al);
		int binarySearch = Collections.binarySearch(al, 14);
		Integer max = Collections.max(al);
		System.out.println(max);
		System.out.println(Collections.min(al));
		//Collections.rotate(al, 2);
		System.out.println(binarySearch);
		
//		al.sort((a,b)->b.compareTo(a));
//		System.out.println(al);
		
		System.out.println(Collections.class.getDeclaredMethods().length);
		Method[] declaredMethods = Collections.class.getDeclaredMethods();
		for(Method m:declaredMethods)
		{
			System.out.println(m.getName());
		}
		
		
//		
		
		
		

	}

}
