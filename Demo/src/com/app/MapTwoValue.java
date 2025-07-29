package com.app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//Use this editor to write, compile and run your Java code online
//statement :sort the second map based on values in descending order & then map keys from first map
//		Sample Output   :
//		103,70000 105,60000 like wise....
public class MapTwoValue {

	public static void main(String[] args) {
		 Map<Integer,Double> result=new HashMap<>();
	       Map<Integer, String> map1 = new HashMap<>();
	        map1.put(101,"Rahul");
	        map1.put(103,"Raj");
	        map1.put(106,"Chinna");
	        map1.put(105,"Rahim");
	        Map<String, Double> map2 = new HashMap<>();
	        map2.put("Chinna",50000.0);
	        map2.put("Rahim",60000.0);
	        map2.put("Raj",70000.0);	        
	        map2.put("Rahul",20000.0);
	        Map<String, Double> sortedMap = map2.entrySet().stream()
                    .sorted(Entry.comparingByValue())
                    .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e2, e1) -> e1, LinkedHashMap::new));
	      
		System.out.println(sortedMap);

	}

}
