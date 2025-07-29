package com.app.parrallel.stream;

import java.util.ArrayList;
import java.util.List;

public class ParrallelStreamDemo {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(25);
		al.add(36);
		al.add(14);
		al.add(23);
		al.add(21);
		System.out.println(al);
		long count = al.stream().count();
		System.out.println(count);

	}

}
