package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.java8.employee.Employee;

public class MapSortDemo {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		map.put("five", 5);
		//System.out.println(map);
		ArrayList<Entry<String, Integer>> arrayList = new ArrayList<>(map.entrySet());
		
		//way1
		/*Collections.sort(arrayList, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getKey().compareTo(o2.getKey());
			}
		});*/
		
		//way2		
		/*Collections.sort(arrayList,( o1,  o2)-> o1.getKey().compareTo(o2.getKey()));
		
		for(Entry<String, Integer> entry:arrayList)
		{
			System.out.println(entry.getKey()+"=>"+entry.getValue());
		}*/
		
		//way3
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		Map<Employee,Integer> empMap=new TreeMap<>((o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
		empMap.put(new Employee(101, "Sonu", "CS", 150), 150);
		empMap.put(new Employee(102, "Atul", "IAS", 250), 850);
		empMap.put(new Employee(103, "Vivaan", "IPS", 350), 650);
		empMap.put(new Employee(104, "Aman", "ME", 100), 950);
		empMap.put(new Employee(105, "Shivam", "CID", 450), 550);
		
		//System.out.println(empMap);
		empMap.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
		.forEach(System.out::println);
		
	}

}








