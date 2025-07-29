package com.app.test;

public class FibonnaciSeries {

	public static void main(String[] args) {
		int prev=0;
		int next=1;
		for(int  i=0;i<10;i++)
		{
			
			System.out.println(prev);
			int temp=next+prev;
			prev=next;
			next=temp;
			
			
			
		}

	}

}
