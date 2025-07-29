package com.app.code;

import java.util.Arrays;

public class PairOfSum {

	public static void main(String[] args) {
		int arr[]= {1,4,5,6,8,2,3};
		int target=8;
		
		pairOfSum(arr,target);

	}

	 static boolean twoSum(int[] arr, int target){
	       
	        Arrays.sort(arr);

	        int left = 0, right = arr.length - 1;

	        // Iterate while left pointer is less than right
	        while (left < right) {
	            int sum = arr[left] + arr[right];

	            // Check if the sum matches the target
	            if (sum == target)
	                return true;
	            else if (sum < target)
	            
	            // Move left pointer to the right
	                left++; 
	            else
	            
	            // Move right pointer to the left
	                right--;
	        }
	        // If no pair is found
	        return false;
	 }
	private static void pairOfSum(int[] arr, int target) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int  j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println("Pair of Sum ["+arr[i]+","+arr[j]+"]:"+target);
					return ;
				}
			}
		}
		System.out.println("No Pair found for target:"+target);
		
	}

}
