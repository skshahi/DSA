package com.app.singleton_dp;

class User{
	private static User user;
	
	private User()
	{
		
	}
	public static User getUser()
	{
		if(user==null)
		{
			synchronized (User.class) {
				user=new User();
				
			}
		}
		return user;
	}
}

public class SingletonDPLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
