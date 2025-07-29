package com.app.condition;

public class ConditionalDemo {

	public static void main(String[] args) {
//		for(;;)
//		{
//			System.out.println(10);
//		}
		//System.out.println(Math.floor(Math.random()*10));
//		for(int i=0;i<10;i++)
//		{
//			System.out.println((int)Math.floor(Math.random()*10));
//		}
		System.out.println(Math.abs(10.25));
		System.out.println(Math.addExact(10, 20));
		System.out.println(Math.ceil(10.9));
		System.out.println(Math.floor(10.1));
		System.out.println(Math.log(10));
		System.out.println(Math.max(10, 35));
		int []a={10,5,47,6,53};
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			max=Math.max(max, a[i]);
			min=Math.min(min, a[i]);
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(Math.sqrt(4));
		

	}

}
