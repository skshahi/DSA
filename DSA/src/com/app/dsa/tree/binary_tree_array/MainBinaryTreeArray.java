package com.app.dsa.tree.binary_tree_array;

public class MainBinaryTreeArray {

	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree(9);
		
		bt.insert("N1");
		bt.insert("N2");
		bt.insert("N3");
		bt.insert("N4");
		bt.insert("N5");
		bt.insert("N6");
		bt.insert("N7");
		bt.insert("N8");
		bt.insert("N9");
		bt.insert("N10");
		
		bt.preOrder(1);
		System.out.println("\n");
		bt.inOrder(1);
		System.out.println("\n");
		bt.postOrder(1);
		System.out.println("\n");
		bt.levelOrder();
		
		bt.search("N51");
		

	}
	
	


}
