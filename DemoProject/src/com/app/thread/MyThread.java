package com.app.thread;

class ThreadClass extends Thread
{
	public void run(){
		for(int i=0;i<10;i++)
		{
			System.out.println("sonu");
		}
	}
	
}

public class MyThread {

	public static void main(String[] args) {
		ThreadClass t=new ThreadClass();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main-thread");
		}

	}

}
