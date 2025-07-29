package com.app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8CommonProgrammingQA {
	public static void main(String[] args) {
		List<Student> studentList = Stream.of(
				new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122,
						Arrays.asList("+912632632782", "+1673434729929")),
				new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67,
						Arrays.asList("+912632632762", "+1673434723929")),
				new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164,
						Arrays.asList("+912632633882", "+1673434709929")),
				new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26,
						Arrays.asList("+9126325832782", "+1671434729929")),
				new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12,
						Arrays.asList("+012632632782")),
				new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90,
						Arrays.asList("+9126254632782", "+16736784729929")),
				new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324,
						Arrays.asList("+912632632782", "+1671234729929")),
				new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433,
						Arrays.asList("+9126326355782", "+1673434729929")),
				new Student(9, "Soni", 27, "Female", "Computer Engineering", "Karnataka", 7,
						Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
				new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98,
						Arrays.asList("+912632646482", "+16734323229929")))
				.collect(Collectors.toList());

		// find student whose rank between 50 to 100
		List<Student> studentRankBetween50_100 = studentList.stream()
				.filter(st -> st.getRank() > 50 && st.getRank() < 100).collect(Collectors.toList());

		// System.out.println(studentRankBetween50_100);

		// Find Student staying Karnataka and sort by there name;

		List<Student> studentSortedByFirstNameAndBelongKT = studentList.stream()
				.filter(student -> student.getCity().equals("Karnataka"))
				.sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
		System.out.println(studentSortedByFirstNameAndBelongKT);

		// Find Student statying kernataka and sort by desc firstname
		List<Student> studentSortedReverseByFirstNameAndBelongKT = studentList.stream()
				.filter(student -> student.getCity().equals("Karnataka"))
				.sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder()))
				.collect(Collectors.toList());
		System.out.println(studentSortedReverseByFirstNameAndBelongKT);

		// Find all department name;

		List<String> depts = studentList.stream().map(stud -> stud.getDept()).distinct().collect(Collectors.toList());

		System.out.println(depts);

		// Find student contacts;

		List<List<String>> contactList = studentList.stream().map(student -> student.getContacts())
				.collect(Collectors.toList());

		System.out.println(contactList);

		// one to many relation we can use flat map
		List<String> contacts = studentList.stream().flatMap(student -> student.getContacts().stream())
				.collect(Collectors.toList());

		System.out.println(contacts);
		
		//group the student by departments
		
		Map<String, List<Student>> studentByDept = studentList.stream().collect(Collectors.groupingBy(Student::getDept));

		System.out.println(studentByDept);
		
		//find total student in each dept
		Map<String, Long> studentInDept = studentList.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.counting()));
		
		System.out.println(studentInDept);
		
		 Entry<String, Long> entry = studentList.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.counting()))
		 .entrySet().stream().max(Map.Entry.comparingByValue()).get();
		 
		 System.out.println(entry.getValue());
		 
		 
		 //find the average age of male and female students
		 Map<String, Double> MaleFemaleAvg = studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
		 System.out.println(MaleFemaleAvg);
		 
		 
		 //find highest rank of each department
		 Map<String, Optional<Student>> studentRankByDept = studentList.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.minBy(Comparator.comparing(Student::getRank))));
	System.out.println(studentRankByDept);
	
	//find the student who has second rank
	 Student studentSortedByRank = studentList.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
	System.out.println(studentSortedByRank);
	
	}

}
