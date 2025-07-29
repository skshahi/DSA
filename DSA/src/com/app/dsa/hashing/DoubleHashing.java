package com.app.dsa.hashing;

import java.util.ArrayList;

public class DoubleHashing {
	String hashTable[];
	int noOfCellUsedInHashTable=0;
	public DoubleHashing(int size)
	{
		hashTable=new String[size];
		noOfCellUsedInHashTable=0;
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
		double loadFactor=noOfCellUsedInHashTable*1.0/hashTable.length;
		return loadFactor;
		
	}
	
	
	//rehash
	
	public void rehashKeys(String word)
	{
		noOfCellUsedInHashTable=0;
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
				//insertInHashTable(str);
				insertKeyinHashtable(str);
				
			}
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
	
	//----------
	private int addAllDigitTogether(int sum)
	{
		int value=0;
		while(sum>0)
		{
			value=sum%10;
			sum=sum/10;
		}
		return value;
			
		
	}
	
	public int secondHashFunction(String x,int M)
	{
		char ch[];
		ch=x.toCharArray();
		int i,sum;
		for(i=0,sum=0;i<x.length();i++)
		{
			sum+=ch[i];
		}
		while(sum>hashTable.length)
		{
			sum=addAllDigitTogether(sum);
		}
		return sum%M;
		
	}
	
	public void insertKeyinHashtable(String value)
	{
		double loadfactor=getLoadFactor();
		if(loadfactor>=0.75)
		{
			rehashKeys(value);
		}else {
			int x=modASCIIHashFunction(value, hashTable.length);
			int y=secondHashFunction(value,  hashTable.length);
			for(int i=0;i< hashTable.length;i++)
			{
				int newIndex=(x+ i*y)% hashTable.length;
				if(hashTable[newIndex]==null)
				{
					hashTable[newIndex]=value;
					System.out.println("The "+value+" inserted at location:"+newIndex);
					break;
				}else {
					System.out.println("Index is already occupied.try for next index");
					
				}
			}
			
		}
		noOfCellUsedInHashTable++;
		
	}
	
	
	
	
	

}
