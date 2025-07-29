package com.app;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		ThreadGroup pg=new ThreadGroup("Parent");
		ThreadGroup cg=new ThreadGroup(pg,"Child");
		MyThread t1=new MyThread(pg, "Child1");
		MyThread t2=new MyThread(pg, "Child2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		

	}

}
