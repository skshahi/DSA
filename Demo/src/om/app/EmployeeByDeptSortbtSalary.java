package om.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.java8.employee.Employee;

class Emp
{
	String name;
	String dept;
	int salary;
	public Emp(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}

public class EmployeeByDeptSortbtSalary {

	public static void main(String[] args) {
		
		
		
		List<Emp> empList=new ArrayList<>();
		empList.add(new Emp("a", "CS", 150));
		empList.add(new Emp("s", "CS", 130));
		empList.add(new Emp("yi", "EC", 650));
		empList.add(new Emp("yuw", "ME", 150));
		empList.add(new Emp("yuwi", "EC", 1790));
		
		Map<String, List<Emp>> empByDept = empList.stream().sorted((e1,e2)->e2.salary-e1.salary)
				.collect(Collectors.groupingBy((e)->e.dept));
		
		System.out.println(empByDept);

	}

}







