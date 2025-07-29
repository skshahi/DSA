package com.app.dsa.tree.binary_tree_ll;

public class MainBinaryTreeLL {

	public static void main(String[] args) {
		
		BinaryTreeLL bt=new BinaryTreeLL();
		/*
		 * BinaryNode N1=new BinaryNode(); N1.value="N1"; BinaryNode N2=new
		 * BinaryNode(); N2.value="N2"; BinaryNode N3=new BinaryNode(); N3.value="N3";
		 * BinaryNode N4=new BinaryNode(); N4.value="N4"; BinaryNode N5=new
		 * BinaryNode(); N5.value="N5"; BinaryNode N6=new BinaryNode(); N6.value="N6";
		 * BinaryNode N7=new BinaryNode(); N7.value="N7"; BinaryNode N8=new
		 * BinaryNode(); N8.value="N8"; BinaryNode N9=new BinaryNode(); N9.value="N9";
		 * 
		 * N1.left=N2; N1.right=N3; N2.left=N4; N2.right=N5; N3.left=N6; N3.right=N7;
		 * N4.left=N8; N4.right=N9;
		 */
		
//		bt.root=N1;
		
		bt.insert("N1");
		bt.insert("N2");
		bt.insert("N3");
		bt.insert("N3");
		bt.insert("N4");
		bt.insert("N5");
		bt.insert("N6");
		bt.insert("N7");
		bt.insert("N8");
		bt.insert("N9");
		bt.preOrder(bt.root);
		System.out.println("\n");
		bt.inOrder(bt.root);
		System.out.println("\n");
		bt.postOrder(bt.root);
		System.out.println("\n");
		bt.levelOrder();
		System.out.println("\n");
		bt.search("N5");
		
		System.out.println(bt.getDeepestNode().value);
		
		

	}

}
