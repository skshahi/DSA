package com.app.code;

public class Palindrome {

	public static void main(String[] args) {
		String  str="madam1";
		
		StringBuffer sb=new StringBuffer(str);
		StringBuffer sb1=sb.reverse();
		String res = sb1.toString();
		
		System.out.println(res.equals(str));

	}

}
