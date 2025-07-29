import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*assume there is a list of emps
 
Employee: id, name, phone
 
create a method/logic to filter employees whose id is greater than 90000 
 
And sort the employee list by id & name
 
And if employee - name,id,phone all 3 are same then don't allow that employee
 
Prefer: Streams*/
class Employee
{
	int id;
	String name;
	long phone;
	Employee(int id,String name,long phone)
	{
		this.id=id;
		this.name=name;
		this.phone=phone;
	}
	
	
}
 
public class EmplyoeeDemo {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(70000, "A", 1238));
		empList.add(new Employee(80000, "B", 1234));
		empList.add(new Employee(90000, "C", 1235));
		empList.add(new Employee(92000, "D", 1236));
		empList.add(new Employee(93000, "E", 1237));
		System.out.println(empList);
		/*HashMap<Integer, Employee> empMap=new HashMap<>();
		Iterator it1=empList.iterator();
		//while(it1.hasNext())
*/			
		
		
		

	}

}
