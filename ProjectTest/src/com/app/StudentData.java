package com.app;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Student{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}

public class StudentData {

	public static void main(String[] args) {
		List<Student> students=Arrays.asList(new Student(1,"abhishek"),
				new Student(2,"sonu"),
				new Student(3,"Vivaan"),
				new Student(4,"atul"),
				new Student(5,"shivam")
				
				);
		
		List<String> sortedStudent = students.stream().map(s->s.getName().toLowerCase()).sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		
		System.out.println(sortedStudent);
		

	}

}
