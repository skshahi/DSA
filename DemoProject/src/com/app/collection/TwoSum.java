package com.app.collection;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int input[]={7,2,14,15};
		int target=22;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<input.length;i++)
		{
			map.put(input[i], i);
		}
		for(int i=0;i<input.length;i++)
		{
			int secondNum=target-input[i];
			if(map.containsKey(secondNum) && map.get(secondNum)!=i)
			{
				System.out.println("{"+i+","+map.get(secondNum)+"}");
				return;
			}
		}
				

	}

}
