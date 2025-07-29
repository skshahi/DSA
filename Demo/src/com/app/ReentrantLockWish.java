package com.app;

import java.util.concurrent.locks.ReentrantLock;
class Display
{

	ReentrantLock l=new ReentrantLock();
	public void wish(String name)
	{
		l.lock();
		for(int i=0;i<10;i++)
		{
			System.out.println("Happy Birthday "+name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		l.unlock();
	}
	
}

class MyThread1 extends Thread
{
	Display d;
	String name;
	MyThread1(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}

public class ReentrantLockWish {
	public static void main(String[] args) {
		Display d=new Display();
		MyThread1 t1=new MyThread1(d, "Sonu");
		MyThread1 t2=new MyThread1(d, "Atul");	
		MyThread1 t3=new MyThread1(d, "Vivaan");
		t1.start();
		t2.start();
		t3.start();
	}

}
