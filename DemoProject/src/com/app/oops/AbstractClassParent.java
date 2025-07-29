package com.app.oops;

class AbstractClassParentImpl extends AbstractClassParent
{
	{
		System.out.println("AbstractClassParentImpl- instance block");
		
	}
	static{
		System.out.println("AbstractClassParentImpl-static block");
		
	}
	AbstractClassParentImpl()
	{
		System.out.println("AbstractClassParentImpl-No arg constructor ");
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	int sum() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println("AbstractClassParentImpl-main");
		AbstractClassParent acp=new AbstractClassParentImpl();
	//	acp.m3();
		//AbstractClassParent p=new AbstractClassParent();
		acp.main(args);
	}
}

public abstract class AbstractClassParent {
	
	void m1(){
		System.out.println("AbstractClassParent m1");
	}
	abstract void m2();
	abstract int sum();
	{
		System.out.println("AbstractClassParent-instance block");
	};
	AbstractClassParent()
	{
		System.out.println("AbstractClassParent- no Arg");
	}
	static{
		System.out.println("AbstractClassParent-static block");
	}
	static void m3()
	{
		System.out.println("AbstractClassParent- static method");
	}

	public static void main(String[] args) {
		System.out.println("AbstractClassParent-main");
		

	}

}
