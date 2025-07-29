package com.app.rotate;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*1,2,3,4,5,6---input
3,4,5,6,1,2--o/p*/

public class RotateArray {

	public static void main(String[] args) {
	/*	int shift=3;
		List<Integer> al=new LinkedList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);	
		System.out.println(al);
		System.out.println("*******************************************");
		
		
		for(int i=0;i<shift;i++)
		{
			int a=((LinkedList<Integer>) al).removeFirst();
			System.out.println(a);
			((LinkedList<Integer>) al).addLast(a);
		}
		
		
		System.out.println("*******************************************");
		
		for(int i:al)
		{
			System.out.println(i);
		}*/
		int arr[]={1,2,3,4,5,6};
		
		for(int i=0;i<1;i++)
		{
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
				if(arr.length-1==j)
				{
					arr[arr.length-1]=temp;
				}
			}
			arr[arr.length-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
		
		

	}

}
