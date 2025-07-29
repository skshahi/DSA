package com.app;

class EvenOddThreadPrint implements  Runnable{
	
	Object object;
	static int i=1,oddSum=0,evenSum=0;
	public EvenOddThreadPrint(Object object)
	{
		this.object=object;
	}
	public void run() {
		
		while(i<=10)
		{
			if(i%2==0 && Thread.currentThread().getName().equals("even"))
			{
				synchronized (object) {
					System.out.println(Thread.currentThread().getName()+":"+i);
					evenSum+=i;
					i++;
					try {
						object.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
			
			if(i%2!=0 && Thread.currentThread().getName().equals("odd"))
			{
				synchronized (object) {
					System.out.println(Thread.currentThread().getName()+":"+i);
					oddSum+=i;
					i++;
					object.notify();
					
				}
				
			}
		}
		System.out.println(evenSum+"="+oddSum);
		
	}
}

public class EvenIOddbythread {

	public static void main(String[] args) {
		
		Object object=new Object();
		Runnable r1=new EvenOddThreadPrint(object);
		Runnable r2=new EvenOddThreadPrint(object);
		Thread t1=new Thread(r1,"even");
		Thread t2=new Thread(r2,"odd");
		t1.start();
		t2.start();
		

	}

}
