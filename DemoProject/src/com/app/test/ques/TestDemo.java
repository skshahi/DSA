package com.app.test.ques;

import java.util.Arrays;
import java.util.HashMap;
//Programming language java is a

public class TestDemo {

	public static void main(String[] args) {
		String str="Java is programming language";
		char[] split = str.replace(" ", "").toCharArray();
		HashMap<Character,Integer> map=new HashMap<>();
		for(int  i=0;i<split.length;i++)
		{
			if(!map.containsKey(split[i]))
			{
				map.put(split[i], 0);
			}
			map.put(split[i], map.get(split[i])+1);
		}
		
		System.out.println(map);
		
//		for(int i=0;i<split.length;i++)
//		{
//			for(int )
//		}
		//Arrays.sort(split, (o1,o2)->o2.length()-o1.length());
	//	Arrays.stream(split)
		
		
	//	Arrays.stream(split).forEach( i->System.out.print(i +" "));
		
		//Arrays.stream(split).forEach(System.out::print);
		//System.out.println(Arrays.toString(split));

	}

}
