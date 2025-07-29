package com.app.dsa.avl;

public class AVLBinarySearchTreeMain {

	public static void main(String[] args) {
		AVLBinarySearchTree avl=new AVLBinarySearchTree();
		avl.insert(5);
		avl.insert(10);
		avl.insert(15);
		avl.insert(20);
		avl.insert(17);
		
		avl.delete(5);
		
		avl.levelOrder(avl.root);

	}

}
