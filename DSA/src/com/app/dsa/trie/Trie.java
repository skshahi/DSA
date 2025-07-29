package com.app.dsa.trie;

public class Trie {
	 TrieNode root;
	
	public Trie()
	{
		root=new TrieNode();
		System.out.println("The Trie has been created.");
	}
	
	//insert a string in trie
	//case 1: A trie is blank;
	//case 2: new string's prefix is common to another string prefix
	//case 3: new string's prefix is already present as complete string
	//case 4: string to be inserted is already presented in trie.
	
	
	public void insert(String word)
	{
		TrieNode current=root;
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			TrieNode node=current.children.get(ch);
			if(node==null)
			{
				node=new TrieNode();
				current.children.put(ch,node);
				
			}
			current=node;
			
		}
		current.endOfString=true;
		System.out.println("Successfully inserted "+word+" in Trie.");
		
	}
	
	//search for a word in trie
	
	public boolean search(String word)
	{
		TrieNode current=root;
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			TrieNode node = current.children.get(ch);
			if(node==null)
			{
				System.out.println("The Word "+word+" does not exist in Trie.");
				return false;
			}
			current=node;
		}
		if(current.endOfString==true)
		{
			System.out.println("The Word "+word+" exist in Trie.");
			return true;
		}else {
			System.out.println("The Word "+word+" does not exist in Trie. But  it is prefix of another word.");
			
		}
		return current.endOfString;
	}
	
	//delete a string from Trie
	//helper method
	
	private boolean delete(TrieNode parentNode,String word,int  index)
	{
		char ch=word.charAt(index);
		TrieNode  currentNode=parentNode.children.get(ch);
		boolean canThisNodeBeDeleted;
		//case 1: some other  prefix of string  is same as the one that we want to delete (API,APIS)
		if(currentNode.children.size()>1)
		{
			delete(currentNode,word,index+1);
			return false;		
			
		}
		//case 2:The string is a prefix of another string
		
		if(index==word.length()-1)
		{
			if(currentNode.children.size()>=1)
			{
				currentNode.endOfString=false;
				return false;
			}else {
				parentNode.children.remove(ch);
				return true;
			}
		}
		
		//case 3: some other string is prefix of this string (APIS,API)
		if(currentNode.endOfString==true)
		{
			delete(currentNode,word,index+1);
			return false;		
			
		}
		
		//case 4: Not any node depends on this string
		canThisNodeBeDeleted=delete(currentNode,word,index+1);
		if(canThisNodeBeDeleted==true)
		{
			parentNode.children.remove(ch);
			return true;
			
		}else {
			return false;
		}
				
	}
	
	//main delete method
	public void delete(String word)
	{
		if(search(word)==true)
		{
			delete(root,word,0);
		}
	}
	
	
	
	
	
	
	

}
