package com.app.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

class Parent{
	private void m1()
	{
		System.out.println("private");
	}
}
class Child extends Parent{
	private void m1()
	{
		System.out.println("child private ");
	}
}

public class CountOccarence {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList();
		al.add(10);
		al.add(25);
		al.add(10);
		Map<Integer, Long> collect = al.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
		Parent p=new Child();
		TreeMap<Integer, Integer>tm=new TreeMap<>();
		tm.put(10, null);
		tm.put(10, 20);
		System.out.println(tm);
		
		HashMap<Integer, Integer> hm=new HashMap<>();
		hm.put(null, null);
		hm.put(10, null);
		System.out.println(hm);
		Hashtable<Integer, Integer> ht=new Hashtable<>();
		ht.put(20, 30);
		ht.put(10, 23);
		System.out.println(ht);
	
		

	}

}
