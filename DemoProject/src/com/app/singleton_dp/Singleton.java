package com.app.singleton_dp;

public  class Singleton
{
	private static Singleton s=new Singleton();
	
	private Singleton()
	{
		
	}
	
	public static Singleton getIntance()
	{
		return s;
	}
}
