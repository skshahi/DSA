package com.app.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp {
	int id, age;
	String name;

	public Emp(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class GroupByDemo {

	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<>();
		empList.add(new Emp(1, 20, null));
		empList.add(new Emp(2, 40, "atul"));
		empList.add(new Emp(3, 20, "aman"));
		empList.add(new Emp(4, 25, "vivaan"));
		empList.add(new Emp(5, 26, "shivam"));
		empList.add(new Emp(6, 25, "angad"));
		empList.add(new Emp(7, 25, "angad"));

		System.out.println(empList);
	//	Map<Integer, List<Emp>> groupByAge = empList.stream().collect(Collectors.groupingBy(e -> e.age));
	//	System.out.println(groupByAge);
	//	Map<Integer, Set<Emp>> groupByAgeWithUniqueEmp = empList.stream()
		//		.collect(Collectors.groupingBy(e -> e.age, Collectors.toSet()));

		//System.out.println(groupByAgeWithUniqueEmp);
	//	TreeMap<Integer, Set<Emp>> sortEmpListByAge = empList.stream()
	//			.collect(Collectors.groupingBy(e -> e.age, TreeMap::new, Collectors.toSet()));
	//	System.out.println(sortEmpListByAge);
		
		//List<Integer> ages = empList.stream().map(e->e.age).collect(Collectors.toList());
		//System.out.println(ages);
		
		//summaryStatistics of ages
	//	IntSummaryStatistics summaryStatistics = ages.stream().mapToInt(e->e).summaryStatistics();
//		System.out.println("Age Avg:"+summaryStatistics.getAverage());
//		System.out.println("Max age:"+summaryStatistics.getMax());
//		System.out.println("Min Age:"+summaryStatistics.getMin());
		
	//	Stream<Integer> limit = ages.stream().skip(1).limit(2);
	//	System.out.println(limit.findFirst().get());
		//String nameStr = empList.parallelStream().map(e->e.name.toUpperCase()).collect(Collectors.joining(","));
		
		//System.out.println(nameStr);
//		DoubleSummaryStatistics summaryStatistics2 = ages.stream().mapToDouble(e->e).summaryStatistics();
//
//		System.out.println(summaryStatistics2.getMax());
		
		//duplicate name in emplist
	//	List<String> names = empList.stream().map(e->e.name).collect(Collectors.toList());
		//Set<String> uniqueName=new HashSet<>();
	//	List<String> duplicate = names.stream().filter(e->!uniqueName.add(e)).collect(Collectors.toList());
		//System.out.println("Unique Name:"+uniqueName);
		//System.out.println("Duplicate Name:"+duplicate);
		//duplicate name using map
		//Map<String, Long> nameMap = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
//	//	System.out.println(nameMap.entrySet().stream()
//				.filter(n->n.getValue()>1)
//				.map(e->e.getKey()).collect(Collectors.toList()));
		
		//way -3 find duplicate name;
		//Set<String> dupName = names.stream().filter(e->Collections.frequency(names, e)>1).collect(Collectors.toSet());
		//System.out.println(dupName);
		
		//optional
		Optional<Emp> findFirst = empList.stream().filter(e->e.id==2).findFirst();
		
		if(findFirst.isPresent())
		{
			Optional<String> name = Optional.ofNullable(findFirst.get().name);
		//	name.ifPresent((n)->System.out.println("name is "+n));
		
//			if(name.isPresent())
//			{
//			System.out.println(findFirst.get());
//			}else{
//				System.out.println("Please give name");
//			}
		}else
		{
			System.out.println("No Emp Present");
		}
		/*//String orElse = Optional.ofNullable(findFirst.get().name).orElse("Sonukumar");
		String orElse1 = Optional.ofNullable(findFirst.get().name).orElseGet(()->"Sonukumar");
		try {
			String orElse2 = Optional.ofNullable(findFirst.get().name).orElseThrow(()->new Exception("Please provide name"));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(orElse1);*/
		Stream<Emp> sorted = empList.stream().sorted((e1,e2)->e2.age-e1.age);
		System.out.println(sorted.collect(Collectors.toList()));
	}

}
