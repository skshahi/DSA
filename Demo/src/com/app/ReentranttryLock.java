package com.app;

import java.util.concurrent.locks.ReentrantLock;

class MyThreadTryLock extends Thread
{
	static ReentrantLock l=new ReentrantLock();
	public MyThreadTryLock(String name) {
		super(name);
	}
	public void run()
	{
		if(l.tryLock())
		{
			System.out.println(Thread.currentThread().getName()+"--got lock and executing Task");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l.unlock();
		}else
		{
			System.out.println(Thread.currentThread().getName()+"--unable to get lock");
		}
	}
}
public class ReentranttryLock {

	public static void main(String[] args) {
		MyThreadTryLock t1=new MyThreadTryLock("Thread-1");
		MyThreadTryLock t2=new MyThreadTryLock("Thread-2");
		t1.start();
		t2.start();

	}

}
