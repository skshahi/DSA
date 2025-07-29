package codedecode.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Emp
{
	int id;
	long salary;
	int age;
	String name;
	
	
	public Emp(int id, long salary, int age, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public Emp(int id, long salary) {
		super();
		this.id = id;
		this.salary = salary;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", salary=" + salary + ", age=" + age + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class EmployeeSortDemo {

	public static void main(String[] args) {
		List<Emp> empList=new ArrayList<>();
		empList.add(new Emp(1, 1000,24,"Sonu"));
		empList.add(new Emp(2, 2500,25,"Atul"));
		empList.add(new Emp(3, 1500,35,"Vivaan"));
		empList.add(new Emp(4, 500,24,"Shivam"));
		empList.add(new Emp(5, 3000,25,"Aman"));
		//----------------------------------------------------------------------
		//emp sort by highest salary
		
		/*List<Emp> empBySalary = empList.stream()
				.sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary()))
				.collect(Collectors.toList());
		System.out.println(empBySalary);*/
		//----------------------------------------------------------------------
		
		// print emp  3 highest  salary
		
				/*List<Emp> empBySalary = empList.stream()
						.sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).limit(3)
						.collect(Collectors.toList());
				System.out.println(empBySalary);*/
		//---------------------------------------------------------------------
				// print emp less than 3 highest salary
				
				/*List<Emp> empBySalary = empList.stream()
						.sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).skip(3)
						.collect(Collectors.toList());
				System.out.println(empBySalary);*/
	   //--------------------------------------------------------------------------
		/*List<Integer> empAges = empList.stream().map(em->em.getAge()).collect(Collectors.toList());
		IntSummaryStatistics summaryStatistics = empAges.stream().mapToInt(i->i).summaryStatistics();
		System.out.println("Min Emp Age:"+summaryStatistics.getMin());
		System.out.println("Max Emp Age:"+summaryStatistics.getMax());
		System.out.println("Average Emp Age:"+summaryStatistics.getAverage());
		System.out.println("Total Emp:"+summaryStatistics.getCount());*/
		
		//--------------------------------------------------------------
		// print emp in string separated by comma
//		String empNameStr = empList.stream().map(e->e.getName()).sorted()
//		.map(em->em.toUpperCase()).collect(Collectors.joining(", "));
//		System.out.println(empNameStr);
		
		//-----------------------------------------------------------
		//way-1
		/*Map<Integer, List<Emp>> empGroupByAge = empList.stream()
				.collect(Collectors.groupingBy(Emp::getAge));
		System.out.println(empGroupByAge);*/
		//way-2 not  sorted order
		/*Map<Integer, Set<Emp>> empGroupByAge = empList.stream()
				.collect(Collectors.groupingBy(Emp::getAge,Collectors.toSet()));
		System.out.println(empGroupByAge);*/
		
		//way-2
//				Map<Integer, Set<Emp>> empGroupByAge = empList.stream()
//						.collect(Collectors.groupingBy(Emp::getAge,TreeMap::new,Collectors.toSet()));
				//System.out.println(empGroupByAge);

	}

}
