package com.app.dsa.tree.binary_tree_ll;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
	
	BinaryNode root;
	public BinaryTreeLL()
	{
		this.root=null;
	}
	
	//insert node to binary tree
	//TC: O(N) SC:O(N)
	void insert(String value)
	{
		BinaryNode newNode=new BinaryNode();
		newNode.value=value;
		if(root==null)
		{
			root=newNode;
			System.out.println("Inserted new node at Root");
			
			return;
		}else {
			Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
			queue.add(root);
			while(!queue.isEmpty())
			{
				BinaryNode currentNode=queue.remove();
				if(currentNode.left==null)
				{
					currentNode.left=newNode;
					System.out.println("Inserted new node in BT.");
					break;
				}else if(currentNode.right==null)
				{
					currentNode.right=newNode;
					System.out.println("Inserted new node in BT.");
					break;
					
				}else {
					queue.add(currentNode.left);
					queue.add(currentNode.right);
				}
				
			}
			
		}
		
	}
	
	
	//PreOreder Traversal
	void preOrder(BinaryNode node)
	{
		if(node==null)
		{
			return ;
		}
		System.out.print(node.value +" ");
		preOrder(node.left);
		preOrder(node.right);
		
	}
	
	//inOreder Traversal
		void inOrder(BinaryNode node)
		{
			if(node==null)
			{
				return ;
			}
			
			preOrder(node.left);
			System.out.print(node.value +" ");
			preOrder(node.right);
			
		}

		//inOreder Traversal
		void postOrder(BinaryNode node)
		{
			if(node==null)
			{
				return ;
			}
			
			preOrder(node.left);			
			preOrder(node.right);
			System.out.print(node.value +" ");
			
		}
		
		//level order traversal
		void levelOrder()
		{
			Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
			queue.add(root);
			while(!queue.isEmpty())
			{
				BinaryNode currentNode=queue.remove();
				System.out.print(currentNode.value +" ");
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
		
		
		public void search(String value)
		{
			Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
			queue.add(root);
			while(!queue.isEmpty())
			{
				BinaryNode currentNode=queue.remove();
				if(currentNode.value==value)
				{
					System.out.println("The value "+value+" is found in tree.");
					return;
				}else {
					
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
			System.out.println("Node "+value+" is not found in tree.");
		}
	
		
		//delete  a node from BT
		//we  will use level order traversal
		//step 1: find the node  which you want to delete
		//find the deepest node from BT
		//set deepest to node to current node (node which you want to delete) means swap it
		//delete deepest node 
		
		//find the deepest node 
		
		public BinaryNode getDeepestNode()
		{
			Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
			queue.add(root);
			BinaryNode currentNode=null;
			while(!queue.isEmpty())
			{
				currentNode=queue.remove();
				if(currentNode.left!=null)
				{
					queue.add(currentNode.left);
				}
				if(currentNode.right!=null)
				{
					queue.add(currentNode.right);
				}
			}
			
			return currentNode;
		}
		
		//delete deepest node in BT
		
		public void deleteDeepestNode()
		{
			Queue<BinaryNode> queue=new LinkedList<>();
			queue.add(root);
			BinaryNode previousNode,currentNode=null;
			
			while(!queue.isEmpty())
			{
				previousNode=currentNode;
				currentNode=queue.remove();
				if(currentNode.left==null)
				{
					previousNode.right=null;
					return;
				}else if(currentNode.right==null)
				{
					currentNode.left=null;
					return;
				}
				queue.add(currentNode.left);
				queue.add(currentNode.right);
				
				
			}
			
		}
		
		//delete given node
		
		//O(N)
		
		void deleteNode(String value)
		{
			Queue<BinaryNode> queue=new LinkedList<>();
			queue.add(root);
			
			while(!queue.isEmpty())
			{
				BinaryNode currentNode=queue.remove();
				if(currentNode.value==value)
				{
					currentNode.value=getDeepestNode().value;
					deleteDeepestNode();
					System.out.println("The Node is deleted.");
					return;
				}else {
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
			
			System.out.println(value +"is not present in BT.");
			
			
			
			
		}
		
		//delete entire BT
		//O(1)
		public void deleteBT()
		{
			root=null;
			System.out.println("BT has been deleted successfully.");
		}
		
		
		
		

}
