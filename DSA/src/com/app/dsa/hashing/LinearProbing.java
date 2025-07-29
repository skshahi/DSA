package com.app.dsa.hashing;

import java.util.ArrayList;

public class LinearProbing {
	String hashTable[];
	int usedCellNumber=0;
	public LinearProbing(int size)
	{
		hashTable=new String[size];
		usedCellNumber=0;
	}
	//identify the index 
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
	
	public double getLoadFactor()
	{
		double loadFactor=usedCellNumber*1.0/hashTable.length;
		return loadFactor;
		
	}
	
	
	//rehash
	
	public void rehashKeys(String word)
	{
		usedCellNumber=0;
		ArrayList<String> data=new ArrayList<String>();
		for(String s:hashTable)
		{
			if(s!=null)
			{
				data.add(s);
			}
			data.add(word);
			hashTable=new String[hashTable.length*2];
			for(String str:data)
			{
				//insert in hash table
				insertInHashTable(str);
				
			}
		}
	}
	
	public void insertInHashTable(String word)
	{
		double loadFactor=getLoadFactor();
		if(loadFactor>=0.75)
		{
			rehashKeys(word);
		}else {
			int index=modASCIIHashFunction(word, hashTable.length);
			
			for(int i=index;i<index+hashTable.length;i++)
			{
				int newIndex=i%hashTable.length;
				if(hashTable[newIndex]==null)
				{
				hashTable[newIndex]=word;
				System.out.println("The "+word+" successfully inserted at location:"+newIndex);
				break;
				}else {
					System.out.println(newIndex+" is already occupied.trying next empy cell.");
					
				}				
			}				
		}
		usedCellNumber++;
		
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
	
	public boolean searchHashTable(String word)
	{
		int  index=modASCIIHashFunction(word, hashTable.length);
		for(int i=0;i<index+hashTable.length;i++)
		{
			int newIndex=i%index+hashTable.length;
			if(hashTable[newIndex]!=null && hashTable[newIndex].equals(word))
			{
				System.out.println("The "+word+" is found in hashtable.");
				return true;
			}
			
		}
		System.out.println("The "+word+" is not found in hashtable");
		return false;
	}
	
	//delete method
	
	public void deleteKeyHashTable(String word)
	{
		int index=modASCIIHashFunction(word, hashTable.length);
		for(int i=index; i<index+hashTable.length;i++)
		{
			int newIndex=i%hashTable.length;
			if(hashTable[newIndex]!=null && hashTable[newIndex].equals(word))
			{
				hashTable[newIndex]=null;	
				
				System.out.println("The"+ word +"has been deleted successfully.");
				return;
			}
			
		}
		System.out.println("The "+word+" is not found in hashtable.");
		
	}
	
	
	

}
