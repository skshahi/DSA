package com.app.java8;

class Finboacci
{
	int fibo(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}
}

public class FibonacciSeries {

	public static void main(String[] args) {
		Finboacci f=new Finboacci();
		int fibo = f.fibo(10);
		System.out.println(fibo);

	}

}
