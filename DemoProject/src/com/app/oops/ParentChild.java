package com.app.oops;

class ParentP {
	int a = 10;
	static int b = 20;
	static final int c = 30;
	// abstract static int e=14;//
	transient int f = 25;
	volatile int p = 36;

	{
		System.out.println(" Parent Instanse block:" + a + "-b:" + b + "-c" + c + "-f" + f + "-p" + p);
	}
	static {
		// no-static variable access not possible directly in static area
		// (a,f,p)
		System.out.println(" Parent static  block:-b:" + b + "-c" + c);

	}

	public ParentP() {

		System.out.println("ParentP no arg constructor");
	}

	ParentP(int x) {
		System.out.println("ParentP arg constructor");
	}

	void m1() {
		System.out.println("PArent m1");
	}

	static void m2() {
		System.out.println("PArent m2");
	}

	final void m3() {
		System.out.println("PArent m3");
	}

	private void m4() {
		System.out.println("PArent m4");

	}

}

class ChildC extends ParentP {
	int a=100;
	static int b=200;
	{
		System.out.println("Child Instanse block:" + a + "-b:" + b + "-c" + c + "-f" + f + "-p" + p);
	}
	static {
		// no-static variable access not possible directly in static area
		// (a,f,p)
		System.out.println("Child static  block:-b:" + b + "-c" + c);

	}

	ChildC() {
		System.out.println("Child no arg constructor");
	}

	ChildC(int x) {
		System.out.println("Child  arg constructor");
	}

	void m1() {
		System.out.println("Child m1");
	}

	static void m2() {
		System.out.println("Child m2");
	}
	private void m4() {
		System.out.println("Child m4");

	}
	 final void m5()
	 {
	 System.out.println("Child m5");
	 }

	// abstract void m4();

}

public class ParentChild {

	public static void main(String[] args) {
		ChildC p = new ChildC();
		p.m1();
		p.m3();
		p.m2();
		p.m5();
		
		ParentP p1 = new ChildC();
		p1.m1();
		p1.m3();
		p1.m2();
	//	p1.m5();
		

	}

}
