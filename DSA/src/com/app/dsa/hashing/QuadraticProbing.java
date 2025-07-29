package com.app.dsa.hashing;

import java.util.ArrayList;

public class QuadraticProbing {
	String hashTable[];
	int usedCellNumber=0;
	public QuadraticProbing(int size)
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
				insertKeyInHashTable(str);
				
			}
		}
	}
	
	private void insertKeyInHashTable(String word) {
		double loadFactor=getLoadFactor();
		if(loadFactor>=0.75)
		{
			rehashKeys(word);
			
		}else {
			int index=modASCIIHashFunction(word, hashTable.length);
			int counter=0;
			for(int i=index;i<index+hashTable.length;i++)
			{
				int newIndex=(index+(counter*counter))%hashTable.length;
				if(hashTable[newIndex]==null)
				{
					hashTable[newIndex]=word;
					System.out.println(word+" has been inserted successfully.");
					break;
					
				}else {
					System.out.println(newIndex+" is already occupied and try for next index");
					
				}
				counter++;			
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

}
