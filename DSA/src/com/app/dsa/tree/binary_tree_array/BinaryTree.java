package com.app.dsa.tree.binary_tree_array;

public class BinaryTree {
	
	String[] arr;
	int lastUsedIndex=0;
	
	public BinaryTree(int size)
	{
		this.arr=new String[size+1];
		this.lastUsedIndex=0;
		
		System.out.println("Binary Tree of size "+size+" has been created.");
		
	}
	public boolean isFull()
	{
		return arr.length-1==lastUsedIndex;
	}
	
	public void insert(String value)
	{
		if(!isFull())
		{
			arr[lastUsedIndex+1]=value;
			lastUsedIndex++;
			System.out.println("The value of "+value+" has been inserted.");			
		}else {
			System.out.println("The BT is full.");
		}
		
	}
	
	//preOrder traversal
	
	public void preOrder(int index)
	{
		if(index>lastUsedIndex)
		{
			return;
			
		}else {
			System.out.print(arr[index]+" ");
			preOrder(2*index);
			preOrder(2*index+1);
		}
		
	}
	
	//preOrder traversal
	
		public void inOrder(int index)
		{
			if(index>lastUsedIndex)
			{
				return;
				
			}else {
				
				inOrder(2*index);
				System.out.print(arr[index]+" ");
				inOrder(2*index+1);
			}
			
		}
		
		//postOrder traversal
		
			public void postOrder(int index)
			{
				if(index>lastUsedIndex)
				{
					return;
					
				}else {
					
					postOrder(2*index);					
					postOrder(2*index+1);
					System.out.print(arr[index]+" ");
				}
				
			}
			
			
			//postOrder traversal
			
			public void levelOrder()
			{
				for(int i=1;i<=lastUsedIndex;i++)
				{
					System.out.print(arr[i]+" ");
				}
				System.out.println("\n");
			}
			
			//search node in BT
			//O(N)
			public int search(String value)
			{
				for(int i=1;i<=lastUsedIndex;i++)
				{
					if(arr[i]==value)
					{
						System.out.println("Value found at index "+i);
						return i;
					}
				}
				System.out.println("The value doe not existin BT.");
				return -1;
			}
			
			//delete value from BT
			//O(N)
			public void delete(String value)
			{
				for(int i=1;i<=lastUsedIndex;i++)
				{
					if(arr[i]==value)
					{
						arr[i]=arr[lastUsedIndex];
						arr[lastUsedIndex]=null;
						lastUsedIndex--;
						
						System.out.println("The value is deleted successully");
					}
				}
				System.out.println("The value doe not existin BT.");
				return;
			}
			
			public void deleteBT()
			{
				try {
				arr=null;
				lastUsedIndex=0;
				System.out.println("The BT has been successfully deleted.");
				}catch (Exception e) {
					System.out.println("There is some error while deleting BT.");
				}
			}
			
			
			
			
			
		
		
	
	
	
	

}
