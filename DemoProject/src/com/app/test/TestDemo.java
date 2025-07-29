package com.app.test;

import java.util.Arrays;

public class TestDemo {

	public static void main(String[] args) {
		int []a={1,5,3,9,7};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Max:"+a[a.length-1] +"  second max:"+a[a.length-2]);
		

	}

}
