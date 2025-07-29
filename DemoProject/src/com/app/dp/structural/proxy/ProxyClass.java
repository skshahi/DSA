package com.app.dp.structural.proxy;

public class ProxyClass extends RealSubjectcClass {
	
	public  void method()
	{
		System.out.println("I am proxy ");
		
		System.out.println("I making call to original object.");
		super.method();
	}

}
