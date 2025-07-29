package com.app.search;

class Dog
{
	String name;
	
	void m1(int a,double d)
	{
		System.out.println(a+"-"+d);
	}
	void m1(long a,float d)
	{
		System.out.println(a+"-"+d);
	}
	void m1(int a,char d)
	{
		System.out.println(a+"-"+d);
	}
	
}

public class ExcetionDemo {

	public static void main(String[] args) throws Exception {
		
		Dog d=new Dog();
//		d.m1(10, 20.0f);
//		d.m1('c', 'n');
//		d.m1(10, 3l);
//		Dog d=null;
//		Exception []a={new Exception("dog"),new NullPointerException()};
		//throw a;
		//System.out.println("sonu");
		
//		try
//		{
//			
//		}catch (Exception e) {
//			// TODO: handle exception
//		}catch (Throwable e) {
//			// TODO: handle exception
//		}

	}

}
