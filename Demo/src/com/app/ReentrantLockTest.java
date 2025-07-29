package com.app;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

	public static void main(String[] args) {
		ReentrantLock r=new ReentrantLock();
		r.lock();
		r.lock();
		System.out.println(r.isLocked());
		System.out.println(r.isHeldByCurrentThread());
		System.out.println(r.getHoldCount());
		System.out.println(r.hasQueuedThreads());
		System.out.println(r.isFair());
		r.unlock();
		System.out.println(r.getHoldCount());
		System.out.println(r.getQueueLength());
		

	}

}
