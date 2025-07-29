package com.app.oops;

public class GCDemo {

	public static void main(String[] args) {
		GCDemo gc=new GCDemo();
		gc=null;
		//System.gc();
		Runtime.getRuntime().gc();
		
		System.out.println("Main method called");

	}
	protected void finalize() throws Throwable
	{
		System.out.println("Object collected");
	}

}
