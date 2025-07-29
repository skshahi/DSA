package com.app.factory_dp;

public class ProfessionFactory {
	public Profession getProfession(String profession)
	{
		if(profession.equals("teacher"))
		{
			return new Teacher();
		} else if(profession.equals("doctor"))
		{
			return new Doctor();
		}else if(profession.equals("engineer"))
		{
			return new Engineer();
		}else{
			System.out.println("No Profession found");
			return null;
		}
	}

}
