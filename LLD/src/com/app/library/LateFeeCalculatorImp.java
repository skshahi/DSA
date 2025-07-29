package com.app.library;

public class LateFeeCalculatorImp {
	
	public double calculateTotalLateFees(LateFeeCalculator[] items,int days)
	{
		double totalLateFee=0;
		for(LateFeeCalculator item:items)
		{
			totalLateFee+=item.calculateLateFee(days);
		}
		return totalLateFee;
	}

}
