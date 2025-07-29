package com.app.exception;

public class TryDemo {
	static int m1()
	{
		try
		{
			//throw new Exception();
			System.out.println(10/0);
			return 1;
		}catch (Exception e) {
			System.out.println("sonu");
			return 2;
		}finally {
			return 3;
		}
	}

	public static void main(String[] args) {
		int x=m1();
		System.out.println(x);

	}

}
