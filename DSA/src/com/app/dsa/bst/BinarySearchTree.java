package com.app.dsa.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	BinaryNode root;
	
	public BinarySearchTree()
	{
		root=null;
	}
	
	//insert node in BST
	
	private  BinaryNode insertNode(BinaryNode currentNode,int value)
	{
		
		if(currentNode==null)
		{
			BinaryNode node=new BinaryNode();
			node.value=value;
			
			//System.out.println("Node inserted successfully.");
			
			return node;
		}else if(value<=currentNode.value)
		{
			//System.out.println("left");
			currentNode.left=insertNode(currentNode.left,value);
			return currentNode;
		}else {
			//System.out.println("right");
			currentNode.right=insertNode(currentNode.right, value);
			return currentNode;
		}
		
		
	}
	
	//TC: O(logn) SC: O(logn)
	public void insert(int value)
	{
		root=insertNode(root,value);
	}
	
	
	//preorder traversal
	//O(n)
	public void preOrder(BinaryNode node)
	{
		if(node==null)
		{
			//System.out.println("BST is Empty");
			return ;
		}else {
			System.out.print(node.value+" ");
			preOrder(node.left);
			preOrder(node.right);
		}
		
	}
	
	//inoreder traversal
	public void inOrder(BinaryNode node)
	{
		if(node==null)
		{
			//System.out.println("BST is Empty");
			return ;
		}else {
			
			inOrder(node.left);
			System.out.print(node.value+" ");
			inOrder(node.right);
		}
		
	}
	

	//post oreder traversal
	public void postOrder(BinaryNode node)
	{
		if(node==null)
		{
			//System.out.println("BST is Empty");
			return ;
		}else {
			
			postOrder(node.left);			
			postOrder(node.right);
			System.out.print(node.value+" ");
		}
		
	}
	
	//level order traversal
	//TC: O(N) SC: O(N)
	public void levelOrder(BinaryNode root)
	{
		if(root==null)
		{
			System.out.println("The BST is empty...");
			return;
		}
		Queue<BinaryNode> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty() )
		{
			BinaryNode currentNode=queue.remove();
			System.out.print(currentNode.value+" ");
			
			if(currentNode.left!=null)
			{
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null)
			{
				queue.add(currentNode.right);
			}
			
		}
		
	}
	
	//search node in BST
	
		public BinaryNode  search(BinaryNode root,int value)
		{
			if(root==null)
			{
				System.out.println("The Value "+value+" is not found in BST.");
				return null;
			}else if(root.value==value)
			{
				System.out.println("value "+value+" is found in BST");
				return root;
			}else if(value<root.value)
			{
				return search(root.left,value);
			}else {
				return search(root.right,value);
			}
			
			
		}
		
		
		//delete node from BST
		
		//find minimum node
		public static BinaryNode  minimumNode(BinaryNode root)
		{
			if(root.left==null)
			{
				return root;
				
			}else {
				return minimumNode(root.left);
			}
		}
		
		
		//delete node
		
		//TC: O(logn) SC: O(logn)
		
		public BinaryNode deleteNode(BinaryNode root,int value)
		{
			if(root==null)
			{
				System.out.println("The Value is not found in BST");
				return null;
			}
			if(value<root.value){
				root.left=deleteNode(root.left, value);			
				
			}else if(value>root.value)
			{
				root.right=deleteNode(root.right,value);
			}else {
				//case 3: if current node have two child
				if(root.left!=null && root.right!=null)
				{
					BinaryNode temp=root;
					//find successor node of root  node 
					//here successor means smallest node in right sub tree
					BinaryNode minNodeForRight=minimumNode(temp.right);
					
					root.value=minNodeForRight.value;
					root.right=deleteNode(root.right, minNodeForRight.value);
					
				}else if(root.left!=null)
				{ //delete from root left value
					root=root.left;
				}else if(root.right!=null)
				{
					//delete from root right node value
					root=root.right;
				}else {
					//delete leaf node
					root=null;
				}
				
			}
			return root;
		}
		
		//delete entire BST
		
		public void deleteBST()
		{
			root=null;
			System.out.println("The BST has been deleted successfully.");
		}
	
	

}
