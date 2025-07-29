package com.app.java8;

public class StringRotation {
	public static  void rightRotation(String str,int rotate)
	{
		int  len=str.length();
		str=str.substring(len-rotate)+str.substring(0, len-rotate);
		System.out.println(str);
		
	}
	
	public static  void leftRotation(String str,int  rotate)
	{
		int  len=str.length();
		str=str.substring(rotate,len)+str.substring(0,rotate);
		System.out.println(str);
	}

	public static void main(String[] args) {
		String str="sonukumar";
		//rightRotation(str, 3);
		leftRotation(str, 3);
		
		
		
		

	}

}
