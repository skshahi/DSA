package com.app.exception;

public class TryCatchDemo {
	TryCatchDemo() throws Exception
	{
		System.out.println("Ceil value:"+Math.ceil(10.2391789));
		
	}
	
	 void m1()
	{
		try
		{
			System.out.println("try-block");
			System.out.println(10/10);
			
			try{
				System.out.println("child try");
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}finally {
			System.out.println("finally-block");
			
		}
	}
	 
	 void m2() throws Exception 
	 {
		 try
		 {
			 System.out.println("m2-try");
			 throw new Exception();
		 }catch (Exception e) {
			 System.out.println("m2-catch");
			throw new Exception(e);
		}finally
		 {
			 System.out.println("m2-finally");
			 throw new Exception();
		 }   
	 }
	public static void main(String[] args) throws Exception {
		TryCatchDemo t=new TryCatchDemo();
		t.m1();
		t.m2();
		
	}

}
