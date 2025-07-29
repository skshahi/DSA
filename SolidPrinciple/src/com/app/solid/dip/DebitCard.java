package com.app.solid.dip;

public class DebitCard implements BankCard {

	@Override
	public void doTransaction(int amount) {
		//debit payment logic
		System.out.println("Succesfull payment with debit card \nBill:"+amount);

	}

}
