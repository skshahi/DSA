package com.app;

class NumberGenerator
{
	public static int fibbonaciSeries(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		
		return fibbonaciSeries(n-1)+ fibbonaciSeries(n-2);
	}
	
	public static  void primeSeries(int n)
	{
		for(int i=1;i<=10;i++)
		{
			boolean flag=true;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
					
				}
			}
			
			if(flag)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void palindrome(int n)
	{
		int temp=n;
		int res=0;
		while(temp>0)
		{
			res=res*10 +temp%10;
			temp=temp/10;
		}
		
		System.out.println(res +" "+n);
		
	}
}

public class PrimeNumber {

	public static void main(String[] args) {
		
		//NumberGenerator n=new NumberGenerator();
		for(int i=0;i<10;i++)
		{
		System.out.print(NumberGenerator.fibbonaciSeries(i) +" " );
		}
		System.out.println("\n");
		
		NumberGenerator.primeSeries(10);
		System.out.println();
		
		NumberGenerator.palindrome(121);
		

	}

}
