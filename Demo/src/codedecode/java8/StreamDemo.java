package codedecode.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> al=Stream.of(14,2,23,2,11,14,5,6,23,53,11).collect(Collectors.toList());
		Stream<Integer> sorted = al.stream().sorted(Comparator.reverseOrder());
		//System.out.println(sorted.collect(Collectors.toList()));
		Integer minValue = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		Integer maxValue = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		//System.out.println(minValue);
		//System.out.println(maxValue);
		Object[] array = al.stream().toArray();
		Object[] array2 = al.toArray();
		int []a={4,7,8,9,9,9,5};
		al.add(58);
		
		List<int[]> asList = Arrays.asList(a);
	//	System.out.println(asList);
	//	al.stream().filter(i->i%2==0).peek(System.out::println).map(j->j*2).forEach(System.out::println);

	//	 al.stream().limit(2).forEach(System.out::println);;
		
		 //----------------------------------------------------------------------------
		 //Remove duplicate from list and print duplicate
		
		// al.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		 
		Set<Integer> set=new HashSet<>();
		 Set<Integer> collect = al.stream().filter(i->!set.add(i)).collect(Collectors.toSet());
		// System.out.println(collect);
		// al.stream().skip(2).forEach(System.out::println);
		// -----------------------------------------------------------------------------------
		 //find word occurrence in stream
		 String str="sonu atul vivaan sonu vivaan shivam aman atul shivam";
		 List<String> strList = Arrays.asList(str.split(" "));
		 Map<String, Long> occurrenceMap = strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(occurrenceMap);
		// -------------------------------------------------
		 
		 Set<Integer> collect2 = al.stream().filter(i->Collections.frequency(al, i)>1).collect(Collectors.toSet());
		System.out.println(collect2);
		
	}

}


