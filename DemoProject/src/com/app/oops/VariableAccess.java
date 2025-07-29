package com.app.oops;

public class VariableAccess {
	int a=10;
	int b;
	static int c;
	final static  int x=10;
	VariableAccess()
	{
		System.out.println("No-Arg Constructor");
	}
	VariableAccess(int a)
	{
		System.out.println("One arg Constructor:"+a);
	}
	VariableAccess(int a,int b)
	{
		System.out.println("Two Arg Constructor:"+a+" b:"+b);
	}
	void m1()
	{
		System.out.println(a+"-b"+b+"-c"+(c+1)+"-x:"+(x));
	}
	static void m2()
	{
		//we can not access instance variable directly
		//System.out.println(a+"-b"+b+"-c"+c);
		System.out.println(c+x);
	}
	final void m3()
	{
		System.out.println("final method");
	}
	

	public static void main(String[] args) {
		 final int x=0;
		
		System.out.println(x);
		// TODO Auto-generated method stub
		VariableAccess va1=new VariableAccess();
		va1.m1();
		va1.m2();
		va1.m3();
		VariableAccess va2=new VariableAccess(100);
		va2.m1();
		va2.m2();
		va2.m3();
		VariableAccess va3=new VariableAccess(300,200);
		va3.m1();
		va3.m2();
		va3.m3();

	}

}
