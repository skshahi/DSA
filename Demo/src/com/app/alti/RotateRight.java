package com.app.alti;

import java.util.LinkedList;
import java.util.List;

//Input: nums = [1,2,3,4,5,6,7], k = 3
//
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]

public class RotateRight {

	public static void main(String[] args) {
		int shift=3;
		LinkedList<Integer> al=new LinkedList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		
		for(int i=0;i<shift;i++)
		{
			int last=al.removeLast();
			al.addFirst(last);
		}
		System.out.println(al);
	}
	

	

	
}
