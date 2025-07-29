package com.app.thread;

public class RunnableImp  implements Runnable{

	static Thread t;
	@Override
	public void run() {
		System.out.println(t.activeCount());
		System.out.println(t.getName());
		System.out.println(t.getName());
		System.out.println(t.isAlive());
		System.out.println(t.isDaemon());
		System.out.println(t.getPriority());
		System.out.println(t.isInterrupted());
		System.out.println(t.getContextClassLoader().getParent());
		System.out.println(t.currentThread().getState().name());
		
		
	}
	
	public static void main(String[] args) {
		RunnableImp r=new RunnableImp();
		 t=new Thread(r);
		t.start();
		System.out.println("Main");
	
	}

}
