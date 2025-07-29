package com.app.solid.dip;

public class ShoppingMall {
	BankCard bankCard;
	public ShoppingMall(BankCard bankCard) {
		this.bankCard=bankCard;
	}
	
	public void purchageThing(int amount)
	{
		bankCard.doTransaction(amount);
	}
	
	public static void main(String[] args) {
		BankCard bankCard=new DebitCard();
		ShoppingMall sm=new ShoppingMall(bankCard);
		sm.purchageThing(5000);
	}
	

}
