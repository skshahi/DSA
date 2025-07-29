package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(20);
		//list.stream().forEach(n->System.out.println(n));
	
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "aghg");
		map.put(5, "byut");
		map.put(2, "ajhj");
		map.put(3, "phj");
		//map.forEach((key,value)->System.out.println(key+"-"+value));
		//map.entrySet().stream().forEach(value->System.out.println(value.getKey()+"=:"+value.getValue()));
		map.entrySet().stream()
		.filter(val->val.getValue().startsWith("a"))
		.forEach(value->System.out.println(value.getKey()+"-"+value.getValue()));
		

	}

}
