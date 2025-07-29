package com.app.java8;
class Singleton
{
	//point 1
	private static Singleton singleton=null;
	
	//point 2
	private Singleton()
	{
		
	}
	
	//point 3
	public static  Singleton getInstanceSingletn()
	{
		if(singleton==null)
		{
			singleton=new Singleton();
		}
		return singleton;
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		

	}

}
