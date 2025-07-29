package com.app.code;

public class MaxSubArraySum {
	  static int maxSubarraySum(int[] arr) {
	        int res = arr[0];
	  
	        // Outer loop for starting point of subarray
	        for (int i = 0; i < arr.length; i++) {
	            int currSum = 0;
	      
	            // Inner loop for ending point of subarray
	            for (int j = i; j < arr.length; j++) {
	                currSum = currSum + arr[j];
	              
	                // Update res if currSum is greater than res
	                res = Math.max(res, currSum);
//	                System.out.println(res);
//	                System.out.println("---------------");
	            }
	        }
	        return res;
	    }
	  
	  static int maxSubarraySumWay2(int[] arr) {
	        
	        // Stores the result (maximum sum found so far)
	        int res = arr[0];
	        
	        // Maximum sum of subarray ending at current position
	        int maxEnding = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            
	            // Either extend the previous subarray or start 
	            // new from current element
	            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
	          
	            // Update result if the new subarray sum is larger
	            res = Math.max(res, maxEnding);
	        }
	        return res;
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 3, -8, 7, -1, 2, 3};
	        System.out.println(maxSubarraySumWay2(arr));
	    }

}
