package com.app.test;

import java.util.LinkedList;
import java.util.List;

public class Test2 {
	//Please implement the following method in a memory efficient way.
	public List<int[]> consolidate(List<int[]> list, List<int[]>... more) {
		   // memory-efficient solution
		
		
		
		// List<Object> collect = Stream.of(more,list).collect(Collectors.toList());
		
		List<int[]> al=new LinkedList<int[]>();
		al.addAll(list);
		for(List<int[]> a:more)
		{
			al.addAll(a);
		}
		
		
		return al;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
