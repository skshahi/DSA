package com.app.search;

class Parent1
{
	Object m1()
	{
		return "sonu";
	}
}
class Child1 extends Parent1
{
	Number m1()
	{
		return 10;
	}
}
public class CovarientDemo {
	public static void main(String[] args) {
		Child1 c=new Child1();
		System.out.println(c.m1());
	}

}
