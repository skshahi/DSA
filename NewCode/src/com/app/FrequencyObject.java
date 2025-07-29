package com.app;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Emp{
	String name;
	int salary;
	String dept;
	public Emp(String name, int salary, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
}

public class FrequencyObject {

	public static void main(String[] args) {
	/*String str="sonusonnu";
	Stream<String> stream = Arrays.stream(str.split(""));

	Map<String, Long> frequency = stream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(frequency);
	}*/
	
		List<Emp> list = Stream.of(new Emp("sonu", 2000, "cs"),
				new Emp("atul", 3200, "me"),
				new Emp("shiavm", 2500, "ec"),
				new Emp("vivaan", 2300, "ce"),
				new Emp("angad", 2040, "cs"),
				new Emp("aman", 2007, "me")
				).toList();
		
		
		Map<String, List<Emp>> groupByDept = list.stream().collect(Collectors.groupingBy(e->e.dept));
		System.out.println(groupByDept);
		
		//approach 1
		Map<String, Optional<Emp>> groupByDeptSorted = list.stream().
				collect(Collectors.groupingBy(e->e.dept,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(e->e.salary)))));
		System.out.println(groupByDeptSorted);
		
		//approach 2
		
		Map<String, Emp> way2 = list.stream()
				.collect(Collectors.groupingBy(e->e.dept,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(e->e.salary)), Optional::get)));
		
		System.out.println(way2);
		//.stream().collect(Collectors.groupingBy(e->e.dept,collectingAndThen(maxBy(Comparator.comparingDouble(e->e.salary)),Optional::get)));
		
		
		IntStream.rangeClosed(1,10).forEach(t->System.out.println(Thread.currentThread().getName()+ t));
		
		
		IntStream.rangeClosed(1,10).parallel().forEach(t->System.out.println(Thread.currentThread().getName()+ t));
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		
	}


}
