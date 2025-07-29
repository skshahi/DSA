package com.app.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArryListDemoArrays {

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
		Arrays.binarySearch(al.toArray(), 30);
		long count = Arrays.stream(al.toArray()).count();
		System.out.println(count);
		

	}

}
