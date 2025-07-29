package com.app.dsa;

class Node {
	
	int data;
	Node left;
	Node right;
public Node(int data) {
	this.data=data;	
		
	}
	
}
class BinaryTree
{
	Node root;
	
	public void insert(int data)
	{
		root=insertRec(root,data);
	}

	private Node insertRec(Node root, int data) {
		
		if(root==null)
		{
			root=new Node(data);
			
		}else if(data<root.data){
			root.left=insertRec(root.left, data);
			
		}else
		{
			root.right=insertRec(root.right, data);
			
		}
		return root;
	}
	public void inOrder() {
		inOrderRec(root);
	}

	private void inOrderRec(Node root) {
		if(root!=null)
		{
			inOrderRec(root.left);
			System.out.print(root.data +" ");
			inOrderRec(root.right);
		}
		
	}
}



public class BinaryTreeDemo {

	public static void main(String[] args) {
		
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(50);
		bt.insert(11);
		bt.insert(20);
		bt.insert(1);
		bt.insert(9);
		bt.inOrder();
		

	}

}
