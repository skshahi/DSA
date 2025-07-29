package com.app.ecom;

/**
 * Singleton, so that only one instance for object can be created
 * 
 */
public class UserDatabase {
	private static UserDatabase instance;
	
	private UserDatabase()
	{
		//makes the constructor private
	}
	
	public static synchronized UserDatabase getIntance()
	{
		if(instance==null)
		{
			instance=new UserDatabase();
		}
		return instance;
		
	}

}
