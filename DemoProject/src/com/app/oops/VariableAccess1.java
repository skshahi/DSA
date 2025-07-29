package com.app.oops;

class VariableCheck
{
	 int x=10;
	static int y=20;
	final int z=30;
	 static final int  m=12;
	 private void m1()
	{
		  System.out.println(" VariableCheck-m1");
		  System.out.println("x:"+x+"-y:"+y+"-z:"+z+"-m:"+m);
		
	}
}

class VariableCheck1 extends VariableCheck
{
	 private  void m1()
	{
		System.out.println(" VariableCheck1-m1");
		
		 System.out.println("x:"+x+"-y:"+y+"-z:"+z+"-m:"+m);
		 m1(20);
	}

	final void m1(int a)
	{
		System.out.println(" VariableCheck1-m1");
		
		 System.out.println("x:"+x+"-y:"+y+"-z:"+z+"-m:"+m +"a-"+a);
	}
	
}

public class VariableAccess1 extends VariableCheck1 {
//	 void m1()
//		{
//			System.out.println(" VariableAccess1-m1");
//			
//			 System.out.println("x:"+x+"-y:"+y+"-z:"+z+"-m:"+m);
//			 m1(20);
//		}
	
	 void m2()
	{
		 System.out.println("VariableAccess1-m2");
		 System.out.println("x:"+x+"-y:"+y+"-z:"+z+"-m:"+m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableAccess1 va=new VariableAccess1();
		va.m1(10);

	}

}
