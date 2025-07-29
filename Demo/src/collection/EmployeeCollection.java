package collection;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable
{
	int id;
	String name;
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Object o) {
		int id1=this.id;
		Employee e1=(Employee)o;
		int id2=e1.id;		
		return id1<id2?-1:id1>id2?1:0;
	}
	
}

class MyComEmp1 implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		
		return e1.name.compareTo(e2.name);
	}

}

public class EmployeeCollection {

	public static void main(String[] args) {
		TreeSet<Employee> empSet=new TreeSet<>(new MyComEmp1());
		empSet.add(new Employee(100, "A"));
		empSet.add(new Employee(101, "E"));
		empSet.add(new Employee(102, "D"));
		empSet.add(new Employee(105, "C"));
		empSet.add(new Employee(106, "B"));
		System.out.println(empSet);
		

	}

}
