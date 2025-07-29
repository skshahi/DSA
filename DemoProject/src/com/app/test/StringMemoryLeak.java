package com.app.test;

public class StringMemoryLeak {

	public static void main(String[] args) {
		String str="sonu";
		System.out.println(str.substring(1,3));//substring(1,3-1);//on
		

	}

}
