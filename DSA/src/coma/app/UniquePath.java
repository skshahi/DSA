package coma.app;

/*Given an matrix of size m x n, the task is to find the count of all unique possible paths from top left to the bottom right with the constraints that from each cell we can either move only to the right or down.

Examples: 

Input: m = 2, n = 2
Output: 2
Explanation: There are two paths
(0, 0) -> (0, 1) -> (1, 1)
(0, 0) -> (1, 0) -> (1, 1)

Input: m = 2, n = 3
Output: 3
Explanation: There are three paths
(0, 0) -> (0, 1) -> (0, 2) -> (1, 2)
(0, 0) -> (0, 1) -> (1, 1) -> (1, 2)
(0, 0) -> (1, 0) -> (1, 1) -> (1, 2)*/

public class UniquePath {
	//Time Complexity: O(m), Auxiliary Space: O(1)
	  static int numberOfPaths(int m, int n) {
	      
	        // We have to calculate m+n-2 C n-1 here
	        // which will be (m+n-2)! / (n-1)! (m-1)!
	        int path = 1;
	        for (int i = n; i < (m + n - 1); i++) {
	            path *= i;
	            path /= (i - n + 1);
	        }
	        return path;
	    }

	 
	    public static void main(String[] args) {
	        int res = numberOfPaths(3, 3);
	        System.out.println(res);
	    }

}
