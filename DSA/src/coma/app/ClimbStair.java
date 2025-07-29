package coma.app;
/*There are n stairs, and a person standing at the bottom wants to climb stairs to reach the top.
 *  The person can climb either 1 stair or 2 stairs at a time, the task is to count the number of ways that 
 *  a person can reach at the top.

Note: This problem is similar to Count ways to reach Nth stair (Order does not matter) with the only difference 
that in this problem, we count all distinct ways where different orderings of the steps are considered unique.

Examples:

Input: n = 1                                                                                                                                                 
Output: 1 
Explanation: There is only one way to climb 1 stair.                                                                                          

Input: n = 2
Output: 2 
Explanation: There are two ways to reach 2th stair: {1, 1} and {2}.  

Input: n = 4 
Output: 5 
Explanation: There are five ways to reach 4th stair: {1, 1, 1, 1}, {1, 1, 2}, {2, 1, 1}, {1, 2, 1} and {2, 2}. */

public class ClimbStair {
	//way-1 O(2^n) Time and O(n) Space
	 static int countWays(int n) {

	        // Base cases: If there are 0 or 1 stairs,
	        // there is only one way to reach the top.
	        if (n == 0 || n == 1)
	            return 1;

	        return countWays(n - 1) + countWays(n - 2);
	    }
	 //way-2  O(n) Time and O(1) Space
	 static int countWays2(int n) {
		  
	        // variable prev1, prev2 - to store the 
	        // values of last and second last states 
	        int prev1 = 1;
	        int prev2 = 1;
	  
	        for (int i = 2; i <= n; i++) {
	            int curr = prev1 + prev2;
	            prev2 = prev1;
	            prev1 = curr;
	        }
	  
	        // In last iteration final value
	        // of curr is stored in prev.
	        return prev1;
	    }

	    public static void main(String[] args) {
	        int n = 4;
	        System.out.println(countWays(n));
	    }

	   
	    
	    
	    

}
