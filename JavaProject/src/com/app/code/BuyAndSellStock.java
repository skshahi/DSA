package com.app.code;

public class BuyAndSellStock {
	 static int maxProfit(int[] prices) {
	        int n = prices.length;
	        int res = 0;
	        int  m=0,l=0;

	        // Explore all possible ways to buy and sell stock
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	            	int temp=res;
	                res = Math.max(res, prices[j] - prices[i]);
	                if(temp!=res)
	                {
	                m=i;
	                l=j;
	                }
	            }
	        }
	        System.out.println(m+","+l);
	        return res;
	    }
	 static int maxProfitWay2(int[] prices) {
	        int minSoFar = prices[0];
	        int res = 0;

	        // Update the minimum value seen so far
	      	// if we see smaller
	        for (int i = 1; i < prices.length; i++) {
	            minSoFar = Math.min(minSoFar, prices[i]);
	           
	            // Update result if we get more profit                
	            res = Math.max(res, prices[i] - minSoFar);
	        }
	        return res;
	    }
	    public static void main(String[] args) {
	        int[] prices = {7, 10, 1, 3, 6, 9, 2};
	        System.out.println(maxProfit(prices));
	    }

}
