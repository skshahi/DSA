package com.java8;

interface interf1
{
	default void m1()
	{
		System.out.println("default 1");
	}
}
interface interf2
{
	default void m1()
	{
		System.out.println("default 2");
	}
}

class Default implements interf1,interf2
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		interf2.super.m1();
	}
	
}

public class DefaultDemo {

	public static void main(String[] args) {
		Default d=new Default();
		d.m1();

	}

}
