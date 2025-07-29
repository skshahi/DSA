package com.app;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		String str="abcabcdbb";
		String res="";
		String temp="";
		
		List<Character> al=new ArrayList<>();;
	
		for(int i=0;i<str.length();i++)
		{
		
			
			if(!al.contains(str.charAt(i)))
			{
				temp+=str.charAt(i);
				al.add(str.charAt(i));
				
			}else {
				al.clear();
				temp="";
				temp +=str.charAt(i);
				
				
			}
			
			if(temp.length()>res.length())
			{
				res=temp;
				//temp="";
			}
			
			
		}
		
		System.out.println(res);
		

	}

}
