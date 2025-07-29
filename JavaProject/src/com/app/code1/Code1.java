package com.app.code1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Code1 {

	public static void main(String[] args) {
		//   10
		//9  ,    15,
	//7      8 12     16
		
		
		// array 7,2,1,5,3,4,5,0
		
		//out: 7,0 (0,7)  2,5(1,3) , 3,4(4,5)
		//[[0,7],[1,3],[4,5]]
		int[] arr= { 7,2,1,5,3,4,5,0};
		int len=arr.length;
		List<List<Integer>> al=new ArrayList<>();
		
		Set<String> set=new HashSet<>();
		
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]+arr[j]==7)
				{
					String str=arr[i]+""+arr[j];
					if(!set.contains(str))
					{
						set.add(str);
						ArrayList<Integer> al1=new ArrayList<>();
						al1.add(i);
						al1.add(j);
						al.add(al1);
						
					}
					
				}
			}
			
			
		}
		System.out.println(al);
		
		

	}

}
