package com.app.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentDemo {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<>();
		ConcurrentHashMap<Integer,Integer> c=new ConcurrentHashMap<>();
		map.put(1, 2);
		map.put(2, 4);
		map.put(3, 5);
		map.put(4, 2);
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		System.out.println(map);
		while(iterator.hasNext())
		{
			Integer key = iterator.next();
			System.out.println(map.get(key));
			if(key.equals(2))
			{
				map.put(4, 14);//no error at CTE or RTE
				map.put(8, 8); //java.util.ConcurrentModificationException
			}
			
		}
		System.out.println(map);

	}

}
