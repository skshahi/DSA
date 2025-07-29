package com.app.java8;



public class StringCompare {

	public static void main(String[] args) {
		String str1="sonu"; 
		String str2="snum";
		boolean flag=false;
		for(int i=0;i<str1.length();i++)
		{
			
			 
			for(int j=0;j<str1.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					//str2.replaceFirst(str2.charAt(j)+"", "1");
					flag=false;
					break;
							
					
				}else {
					flag=true;
				}
			}
			if(flag)
			{
				break;
			}
			
		}
		System.out.println(str1+"-"+str2);
		if(flag)
		{
			System.out.println("String are not equal");
		}else {
			System.out.println(" equal");
		}
		
		

	}

}
