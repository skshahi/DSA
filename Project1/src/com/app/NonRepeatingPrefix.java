package com.app;

public class NonRepeatingPrefix {

	public static void main(String[] args) {
		
		String str="sssonu";
		String res=str.charAt(0)+"";
		for(int  i=1;i<str.length();i++)
		{
			if(res.contains(str.charAt(i)+""))
			{
				res+=str.charAt(i);
				
			}else {
				break;
			}
		}
		System.out.println(res);

	}

}
