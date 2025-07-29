package com.app.factory_dp;

public class MainFactoryClass {

	public static void main(String[] args) {
		ProfessionFactory pf=new ProfessionFactory();
		Profession profession = pf.getProfession("engineer");
		profession.print();
	}

}
