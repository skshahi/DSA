package coma.app;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

//Given an integer array nums, 

//return all the triplets [nums[i], nums[j], nums[k]] 
//such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//the solution set must not contain duplicate triplets.
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]

public class TripletSum {

	public static void main(String[] args) {
		Set<ArrayList<Integer>> list=new LinkedHashSet<>();
		
		int nums[] = { -1, 0, 1, 2, -1, -4 ,1,3};
		System.out.println();
		for (int i = 0; i < nums.length-2; i++) {
			int k=0;
			for (int j = i + 1; j < nums.length-1; j++) {
				k=j+1;
				if(nums[i]+nums[j]+nums[k]==0)
				{
					ArrayList<Integer> triplet = new ArrayList<>();
					triplet.add(nums[i]);
					triplet.add(nums[j]);
					triplet.add(nums[k]);
					
					list.add(triplet);				
					
					
				}			
				

			}
			
		}
		System.out.println(list);

	}

}
