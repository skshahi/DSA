package com.app.alti;

class A {
	static {
		System.out.println("Static A");
	}
	A() {
		System.out.println("Constructor A");
	}
	public static void aStaticMethod() {
		System.out.println("Static Method A");
	}
	public void print() {
		System.out.println("Print A");
	}
}

class B extends A {
	static {
		System.out.println("Static B");
	}
	B() {
		System.out.println("Constructor B");
		A a = new A();
	}
	B(int a)  {
		System.out.println("Constructor B with args");
	}
	public static void bStaticMethod() {
		System.out.println("Static Method B");
	}
	public void print() {
		System.out.println("Print B");
	}
}

class C extends A {
	static {
		System.out.println("Static C");
	}
	C() {
		System.out.println("Constructor C");
	}
	C(int a)  {
		System.out.println("Constructor C with args");
	}
	public void print() {
		System.out.println("Print C");
	}
}

class D {
	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		a.print();
		b.print();
		A.aStaticMethod();
	}
}