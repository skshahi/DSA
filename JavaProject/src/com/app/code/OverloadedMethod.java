package com.app.code;
class OverLoadDemo{
	public  int  m1(int  x,int y)
	{
		System.out.println("int");
		return 1;
	}
	public  double  m1(double x,int y)
	{
		System.out.println("double");
		return 1;
	}
	
}

public class OverloadedMethod {
	public static void main(String[] args) {
		OverLoadDemo c=new OverLoadDemo();
		c.m1(1.0,2);
		c.m1(0, 0);
	}
	

}
