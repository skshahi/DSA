package com.app.dsa.binaryheap;

public class BinaryHeapMain {

	public static void main(String[] args) {
		BinaryHeap bh=new BinaryHeap(10);
	
		bh.insert(10,"min");
		bh.insert(5,"min");
		bh.insert(15,"min");
		bh.insert(1,"min");
		bh.levelOrder();
		System.out.println(bh.peek());;
		bh.levelOrder();
		System.out.println(bh.extractHeadOfBH("min"));
		bh.levelOrder();

	}

}
