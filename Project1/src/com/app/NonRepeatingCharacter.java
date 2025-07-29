package com.app;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String str="sonuso";
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(res.contains(str.charAt(i)+""))
			{
				break;
				
			}else {
				res+=str.charAt(i);
			}
		}
		System.out.println(res);

	}

}
