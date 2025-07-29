package com.app.code;

import java.util.Arrays;

public class LongestPrefixInStringArray {

	public static void main(String[] args) {
		String str[]= {"flower","flow","floy"};
		Arrays.sort(str);
		
		
		 int  len=str.length;
		  String prefix="";
		  
			String temp=str[0];
			for(int i=0;i<temp.length();i++)
			{
			  
			  for(int j=i;j<len;j++)
			  {
				String t=str[j+1];
			
				if(temp.charAt(i)==t.charAt(i))
				{
				  prefix=prefix+temp.charAt(i);
				  break;
				}else {
					break;
				}
				
			  }
			}
			
			System.out.println(prefix);
		
		

	}

}
