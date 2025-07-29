package com.app.solid.dip;
 
public class CreditCard implements BankCard{
	
	public void doTransaction(int amount)
	{
		System.out.println("Succesfull payment with credit card \nBill:"+amount);
	}

}
