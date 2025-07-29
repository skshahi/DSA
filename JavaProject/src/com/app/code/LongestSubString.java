package com.app.code;

public class LongestSubString {

	public static void main(String[] args) {
		String str="geeksforgeeks";
		String  res="";
		for(int  i=0;i<str.length()-1;i++)
		{
			String temp="";
			for(int  j=i;j<str.length()-1;j++)
			{
				if(str.charAt(j)==str.charAt(j+1))
				{
					break;
				}else {
					temp+=str.charAt(j);
				}
				
			}
			//System.out.println(temp);
			if(temp.length()>res.length())
			{
				res=temp;
			}
			
		}
		
		System.out.println("Longest SubString:"+res);

	}

}
