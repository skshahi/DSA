package com.app.collection;

import java.util.TreeSet;



public class TeeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(40);
		ts.add(80);
		ts.add(20);
		ts.add(1);
		ts.add(22);
		ts.add(16);
		ts.add(90);
		ts.add(90);
		
		
		ts.add(5);
		//ts.add(null);
		System.out.println(ts.descendingSet());
		System.out.println(ts.ceiling(50));;
		System.out.println(ts);
		//System.out.println(ts.);
		
		//System.out.println(ts.descendingIterator().forEachRemaining(action););
		

	}

}
