package com.app.prototype_dp;

import java.util.HashMap;

public class ProfessionCache {
	private static HashMap<Integer, Profession> cache=new HashMap<>();
	
	public static Profession getChacheNewProfession(int id)
	{
		Profession profession = cache.get(id);
		return (Profession) profession.clone();
		
		
	}
	
	public static void loadCacheProfessions()
	{
		Doctor d=new Doctor();
		d.id=1;
		d.name="Atul";
		cache.put(d.id, d);
		
		Teacher t=new Teacher();
		t.id=2;
		t.name="shivam";
		
		cache.put(t.id, t);
		
		Engineer e=new Engineer();
		e.id=3;
		e.name="sonu";
		cache.put(e.id, e);
	}

}
