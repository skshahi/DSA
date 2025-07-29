package com.app.test;

public class RightRotateString {

	public static void main(String[] args) {
		String str="herbalife";
		int rotate=2;
		
		System.out.println(str.substring(str.length()-rotate)+str.substring(0,str.length()-rotate));

	}

}
