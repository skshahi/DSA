package com.app.singleton_dp;



 public  class SingletonDP {

	public static void main(String[] args) {
		Singleton intance = Singleton.getIntance();
		Singleton intance2 = Singleton.getIntance();
		System.out.println(intance==intance2);
		

	}

}
