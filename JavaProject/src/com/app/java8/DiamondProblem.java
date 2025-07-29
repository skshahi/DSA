package com.app.java8;

interface Interf1
{
	default void m1()
	{
		System.out.println("Interf1-default-m1");
	}
}
interface Interf2
{
	default void m1()
	{
		System.out.println("Interf1-default-m1");
	}
}

class Diamond implements Interf1,Interf2
{

	@Override
	public void m1() {
		
		Interf1.super.m1();
	}
	
}


public class DiamondProblem {

	public static void main(String[] args) {
		Diamond d=new Diamond();
		d.m1();

	}

}
