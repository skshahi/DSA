package com.app.dsa.avl;

import java.util.LinkedList;
import java.util.Queue;

public class AVLBinarySearchTree {
	BinaryNode root;

	AVLBinarySearchTree() {
		root = null;
		System.out.println("AVL Tree has been created.");
	}
	
	
	//insert node in AVL
	
	public int  getHeight(BinaryNode node)
	{
		if(node==null)
		{
			return 0;
		}
		return node.height;
	}
	
	//rotate right
	private BinaryNode rotateRight(BinaryNode disbalancedNode)
	{
		BinaryNode newRoot=disbalancedNode.left;
		disbalancedNode.left=disbalancedNode.left.right;
		newRoot.right=disbalancedNode;
		disbalancedNode.height=1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
		newRoot.height=1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
		
		return newRoot;
		
	}
	
	//rotate left
		private BinaryNode rotateLeft(BinaryNode disbalancedNode)
		{
			BinaryNode newRoot=disbalancedNode.right;
			disbalancedNode.right=disbalancedNode.right.left;
			newRoot.left=disbalancedNode;
			disbalancedNode.height=1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
			newRoot.height=1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
			
			return newRoot;
			
		}
		
		//get balance node
		
		public int getBalanceNode(BinaryNode node)
		{
			if(node==null)
			{
				return 0;
			}
			return getHeight(node.left)-getHeight(node.right);
			
		}
		
		// helper method insertNode 
		
		private BinaryNode insertNode(BinaryNode  node,int value)
		{
			if(node==null)
			{
				BinaryNode newNode=new BinaryNode();
				newNode.value=value;
				newNode.height=1;
				return newNode;
			}else if(value<node.value){
				node.left=insertNode(node.left,value);
				
			}else{
				node.right=insertNode(node.right,value);
				
			}
			
			node.height=1+ Math.max(getHeight(node.left),getHeight(node.right));
			int balance=getBalanceNode(node);
			
			//LL condition
			if(balance>1 && value<node.left.value)
			{
				return rotateRight(node);
			}
			
			//LR condition
			if(balance>1 && value<node.left.right.value)
			{
				node.left=rotateLeft(node.left);
				return rotateRight(node);
			}
			//RR condition
			
			if(balance<-1 && value>node.right.value)
			{
				return rotateLeft(node);
			}
			//RL condition
			
			if(balance<-1 && value<node.right.value)
			{
				node.right=rotateRight(node.right);
				return rotateLeft(node);
			}
			return node;
			
			
			
			
		}
		
		//main insert method
		
		public void insert(int value)
		{
			root=insertNode(root,value);
		}
		
		
	

	// pre-order traversal
	public void preOrder(BinaryNode node) {
		if (node == null) {
			System.out.println("The AVL is empty.");
			return;
		}
		System.out.print(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	// in-order traversal
	public void inOrder(BinaryNode node) {
		if (node == null) {
			System.out.println("The AVL is empty.");
			return;
		}

		inOrder(node.left);
		System.out.print(node.value + " ");
		inOrder(node.right);
	}

	// post-order traversal
	public void postOrder(BinaryNode node) {
		if (node == null) {
			System.out.println("The AVL is empty.");
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + " ");

	}
	
	//level order traversal
	
	public void levelOrder(BinaryNode node)
	{
		if(node==null)
		{
			System.out.println("The AVL is empty.");
			return;
		}
		Queue<BinaryNode> queue=new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty())
		{
			BinaryNode currentNode=queue.remove();
			System.out.print(currentNode.value+" ");
			if(currentNode.left!=null)
			{
				levelOrder(currentNode.left);
			}
			if(currentNode.right!=null)
			{
				levelOrder(currentNode.right);
			}
		}
		
		
	}
	
	//search node in AVL
	
	public BinaryNode search(BinaryNode node,int value)
	{
		if(node==null)
		{
			System.out.println("The value is not found in AVL");
			return null;
		}else if(node.value==value){
			System.out.println("The value "+value+" found in AVL.");
			return node;
			
		}else if(value<node.value)
		{
			return search(node.left,value);
		}else {
			return search(node.right,value);
		}
		
	}
	
	
	//delete node from avl tree
	
	//helper method
	public static BinaryNode minimumNode(BinaryNode root)
	{
		if(root.left==null)
		{
			return root;
		}
		return minimumNode(root.left);
		
	}
	
	public BinaryNode deleteNode(BinaryNode node,int value)
	{
		if(node==null)
		{
			System.out.println("The value is not found in AVL");
			return node;
		}else if(value<node.value)
		{
			node.left=deleteNode(node.left,value);
		}else if(value>node.value)
		{
			node.right=deleteNode(node.right,value);
		}else {
			//if node have two child
			if(node.left!=null && node.right!=null)
			{
				//find successor of node
				BinaryNode temp=node;
				BinaryNode minNodeForRight=minimumNode(temp.right);
				node.value=minNodeForRight.value;
				node.right=deleteNode(node.right, minNodeForRight.value);
				
			}else if(node.left!=null)
			{
				//delete left
				node=node.left;
			}else if(node.right!=null)
			{//delete right node
				node=node.right;
			}else {
				//delete leaf node 
				node =null;
			}
			
			
		}
		int balance=getBalanceNode(node);
		
		//LL
		if(balance >1 && getBalanceNode(node.left)>=0)
		{
			return rotateRight(node);
		}
		
		//LR
		if(balance>1 && getBalanceNode(node.left)<0)
		{
			node.left=rotateLeft(node.left);
			return rotateRight(node);
		}
		
		//RR 
		if(balance<-1 && getBalanceNode(node.right)<=0)
		{
			return rotateLeft(node);
			
			
		}

		//RL
		if(balance<-1 && getBalanceNode(node.right)>0)
		{
			node.right=rotateRight(node.right);
			return rotateLeft(node);
			
			
		}
		
		return node;
		
		
	}
	
	//final delete method
	//TC: O(logN) SC: O(logN)
	public void  delete(int value)
	{
		root=deleteNode(root, value);
	}
	
	//delete entire AVL
	
	public void deleteAVL()
	{
		root=null;
		System.out.println("AVL tree has been successfully deleted.");
	}
	

}
