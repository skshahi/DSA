package com.app.oops;

class Parent
{
	void m1()
	{
		System.out.println("Parent-m1");
		
	}
	static void m2()
	{
		System.out.println("Parent-m2");
		
	}
	private void m3()
	{
		System.out.println("Parentm3");
	}
}

class child1 extends Parent
{ 
	 void m1()
	{
		System.out.println("child1-m1");
		
	}

	static void m2()
	{
		System.out.println("child1-m2");
		
	}
	private void m3()
	{
		System.out.println("child1 m3");
	}
}
class child2 extends Parent
{
	void m1()
	{
		System.out.println("child2-m1");
		m3();
		
	}
	static void m2()
	{
		System.out.println("child2-m2");
		//m3();
		
	}
	private void m3()
	{
		System.out.println("child2 m3");
	}
}
public class Parent1 {
	void m1()
	{
		System.out.println("Parent1-m1");
	}
	
	public static void main(String[] args) {
		Parent c2=new child2();
		c2.m1();
		c2.m2();
	 
	}

}
