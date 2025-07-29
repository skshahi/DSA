package com.app.collection;

public class BuySellStock {

	public static void main(String[] args) {
		int []price={7,1,2,5,4,6};
		int val=buySellStock(price);
		System.out.println(val);

	}

	private static int buySellStock(int[] price) {
		if(price.length<2)
		{
			return 0;
		}
		int minPriceSoFor=price[0];
		int calcutedProfitSoFor=0;
		for(int i=1;i<price.length;i++)
		{
			calcutedProfitSoFor=Math.max(calcutedProfitSoFor, price[i]-minPriceSoFor);
			minPriceSoFor=Math.min(minPriceSoFor, price[i]);
		}
		System.out.println(minPriceSoFor);
		return price[calcutedProfitSoFor];
	}

}
