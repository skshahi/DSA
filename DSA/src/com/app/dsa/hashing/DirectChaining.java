package com.app.dsa.hashing;

import java.util.LinkedList;

public class DirectChaining {
	
	LinkedList<String>[]hashTable;
	int maxChainSize=5;
	DirectChaining(int size)
	{
		hashTable=new LinkedList[size];
		
	}
	public int modASCIIHashFunction(String word,int M)
	{
		char ch[];
		ch=word.toCharArray();
		int sum,i;
		for(sum=0,i=0;i<ch.length;i++)
		{
			sum=sum+ch[i];
		}
		return sum%M;	
		
		
	}
	//insert method
	
	public void insertHashTable(String word)
	{
		int index=modASCIIHashFunction(word, hashTable.length);
		if(hashTable[index]==null)
		{
			hashTable[index]=new LinkedList<String>();
			hashTable[index].add(word);
		}else {
			hashTable[index].add(word);
			
		}
	}
	
	public void displayHashTable()
	{
		if(hashTable==null)
		{
			System.out.println("HashTable does not exist!");
			return; 
		}else {
			System.out.println("------------------HashTable-------------------------");
			for(int i=0;i<hashTable.length;i++)
			{
				System.out.println("Index:"+i+",Key:"+hashTable[i]);
			}
		}
		
	}
	
	public boolean searchHashTable(String  word)
	{
		int index=modASCIIHashFunction(word, hashTable.length);
		if(hashTable[index]!=null && hashTable[index].contains(word))
		{
			System.out.println("The "+word+" is found in hash table");
			return true;
		}
		else {
			System.out.println("The "+word+" is not found in hashtable.");
			return false;
		}
	}
	
	//delete method
	
	public void deleteKeyHashTable(String word)
	{
		int  index=modASCIIHashFunction(word, hashTable.length);
		boolean result=searchHashTable(word);
		if(result==true)
		{
			hashTable[index].remove(word);
			System.out.println("The "+word+" has been deleted successfully.");
			
		}else {
			System.out.println("The "+word+" is not found in hashtable.");
		}
	}

}
