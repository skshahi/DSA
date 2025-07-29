package com.app.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int age,salary,id;
	String name;
	public Employee() {
		super();
	}
	public Employee(int age, int salary, int id, String name) {
		super();
		this.age = age;
		this.salary = salary;
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", salary=" + salary + ", id=" + id + ", name=" + name + "]";
	}
	
}

public class Java8EmpDemo {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(20, 2000, 101, "Sonu"));
		empList.add(new Employee(22, 6000, 102, "Atul"));
		empList.add(new Employee(24, 9000, 106, "Shivam"));
		empList.add(new Employee(30, 8000, 104, "Vivaan"));
		empList.add(new Employee(35, 5000, 108, "Aman"));
		System.out.println(empList);
		/*//way1
		List<Employee> sortedEmp = empList.stream().
				sorted((e1,e2)->Integer.valueOf(e2.salary).compareTo(Integer.valueOf(e1.salary))).
				collect(Collectors.toList());
		System.out.println(sortedEmp);*/
		//way2:
		List<Employee> sortedEmp = empList.stream().
				sorted((e1,e2)->e2.salary-e1.salary).
				collect(Collectors.toList());
		System.out.println(sortedEmp);
		
		//find top 3 salary emp
		List<Employee> top3Emp = sortedEmp.stream().limit(3).collect(Collectors.toList());
		System.out.println("Top 3 Emp in Company:");
		top3Emp.forEach(e->System.out.println(e.name+"-"+e.salary));
		//find emp who salary is less than top 3 salary emp
		List<Employee> emplessThanTop3EmpSalary = sortedEmp.stream().skip(3).collect(Collectors.toList());
		System.out.println("Emp less then top 3 salaried emp:");
		emplessThanTop3EmpSalary.forEach(e->System.out.println(e.name+"-"+e.salary));
		
		

	}

}
