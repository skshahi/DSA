package com.app.exception;

//throw delegate call to caller method 
public class TryDemo2 {
	static int m1() throws Exception
	{
		try
		{
			//throw new Exception();
			
			//return 1;
			throw new Exception();
		}catch (Exception e) {
			System.out.println("sonu");
			throw new Exception();
		}finally {
			throw new Exception();
		}
	}

	public static void main(String[] args) throws Exception {
		m1();

	}

}
