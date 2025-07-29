package com.app.dsa.bst;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(70);
		bst.insert(50);
		bst.insert(90);
		bst.insert(30);
		bst.insert(60);
		bst.insert(80);
		bst.insert(100);
		bst.insert(20);
		bst.insert(40);
		/*
		 * bst.preOrder(bst.root); System.out.println("\n"); bst.inOrder(bst.root);
		 * System.out.println("\n"); bst.postOrder(bst.root); System.out.println("\n");
		 * bst.levelOrder(bst.root); System.out.println("\n");
		 * //bst.search(bst.root,400);
		 */		
		//bst.deleteNode(bst.root, 70);
		bst.deleteBST();
		bst.levelOrder(bst.root);
		
		
		//System.out.println(bst.search(bst.root,40).value);
		

	}
	
	

}
