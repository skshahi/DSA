package com.app.test;

public class StringDemo {

	public static void main(String[] args) {

//		String str1 = "test";
//		String str2 = "test";
//		String  str3=new String("test");
//		str1.concat(str3);
//		
//		System.out.println(str3==str2);//false
//		System.out.println(str3.equals(str2));//true
		
		int [] array1 = {3, 7, 9, 21, 11, 0};
		int [] array2 = {34, 200, 400, 19, 6};
//		 
//		output = {7, 6}; 
//		explanation: minimum difference from each element of an array
		int  val1=0;
		int  val2=0;
		int  diff=0;
		
		
		for(int i=0;i<array1.length;i++)
			
		{
			val1=array1[i];
			for(int j=0;j<array2.length;j++)
			{
				int temp=Math.abs(val1-array2[j]);
				if(diff>temp)
				{
					diff=temp;
					val2=array2[j];
				}
				
				
			}
		}
		
		
		
		

	}

}
