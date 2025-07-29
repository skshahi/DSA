package com.app.code.dp;

 class User
{
	private static User user;
	private User() {}
	
	public static User getUser()
	{
		if(user==null)
		{
			user=new User();
		}
		return user;
	}
	
}

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
