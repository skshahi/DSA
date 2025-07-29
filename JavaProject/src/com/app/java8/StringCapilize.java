package com.app.java8;

public class StringCapilize {

	public static void main(String[] args) {
		String str="sonu_monu_sahil_ajay_p";
		String finalStr="";
		
		for(int i=0;i<str.length();i++)
		{
			int n=0;
			if("_".equals(String.valueOf(str.charAt(i))))
			{
				n=1;
				if(i+1<str.length())
				{
				finalStr=finalStr+String.valueOf(str.charAt(i+1)).toUpperCase();
				i++;
				}
				
			}
			if(n==1)
			{
				
				n=0;
			}else
			{
				finalStr+=str.charAt(i)+"";
			}
			
		}
		System.out.println(finalStr);

	}

}
