package com.app.exception;

class Parent{
	
	void m1() throws InterruptedException, Exception
	{
		System.out.println("Parent m1");
		
	}
}

class Child extends Parent
{
	void m1()  throws Exception
	{
		System.out.println("Child  m1");
	}
}

public class ParentChild {
static int y;
//final int  z;
	public static void main(String[] args) throws Exception {
		int x;
		//System.out.println(x); must be initialize
		System.out.println(y);
		Child c=new Child();
		c.m1();
		Parent p=new Child();
		//p.m1();

	}

}
