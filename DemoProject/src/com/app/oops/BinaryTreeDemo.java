package com.app.oops;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree
{
	class Node {
		int data;
		Node right;
		Node left;
		Node (int data)
		{
			this.data=data;
			right=null;
			left=null;
		}
	}
	Node root;
	public BinaryTree(int rootData) {
		root=new Node(rootData);
		
	}
	
	public void insert(int dataInp)
	{
		Node node=new Node(dataInp);
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node temp = q.remove();
			if(temp.left==null)
			{
				temp.left=node;
				return;
			}else if(temp.right==null)
			{
				temp.right=node;
				return;
			}else{
				q.add(temp.left);
				
			}
		}
		
	}
	
	void inorder(Node temp)
	{
		if(temp==null)
			return;
		inorder(temp.left);
		System.out.println(temp.data);
		inorder(temp.right);
	}
	void preorder(Node temp)
	{
		if(temp==null)
			return;
		System.out.println(temp.data);
		preorder(temp.left);
		
		preorder(temp.right);
	}
	void postorder(Node temp)
	{
		if(temp==null)
			return;
		postorder(temp.left);
		postorder(temp.right);
		System.out.println(temp.data);
		
	}
	
	void levelOrder()
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		if(!q.isEmpty())
		{
			Node current = q.remove();
			System.out.println(current.data);
			if(current.left!=null)
				q.add(current.left);
			if(current.right!=null)
				q.add(current.right);
		}
	}
}

public class BinaryTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
