package com.app.oops;

public class InterfImpl implements Interf {

	
	int x=100,y=200;
	@Override
	public void m1() {
		System.out.println(Interf.x+"-"+y);
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		InterfImpl i=new InterfImpl();
		i.m1();
	}

}
