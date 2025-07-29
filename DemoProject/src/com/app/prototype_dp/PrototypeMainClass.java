package com.app.prototype_dp;

public class PrototypeMainClass {

	public static void main(String[] args) {
		ProfessionCache.loadCacheProfessions();
		Profession profession = ProfessionCache.getChacheNewProfession(1);
		System.out.println(profession);
		profession.print();
		Profession profession1 = ProfessionCache.getChacheNewProfession(2);
		System.out.println(profession1);
		profession1.print();
		Profession profession2 = ProfessionCache.getChacheNewProfession(3);
		System.out.println(profession2);
		profession2.print();
		Profession profession3 = ProfessionCache.getChacheNewProfession(2);
		System.out.println(profession3);
		profession3.print();

	}

}
