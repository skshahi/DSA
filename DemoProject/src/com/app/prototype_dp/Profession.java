package com.app.prototype_dp;

public abstract class Profession implements Cloneable {
	int  id;
	String name;
	abstract void print();
	
	public Object clone()
	{
		Object clone=null;
		try {
			clone=super.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
	}
	

}
