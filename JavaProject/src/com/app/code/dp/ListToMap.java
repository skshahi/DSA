package com.app.code.dp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Emp{
	int  id;
	String name;
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
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
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class ListToMap {
	
	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(2,3,1,4,5,6,9,8,8,7);
		Map<Integer, Long> collect = al.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
		System.out.println(collect);
		//ListToMap.Emp e1=new ListToMap().new Emp(1,"e");
		
    List<Emp> empList = Arrays.asList(new Emp(1,"a"),new Emp(2,"b"),new Emp(3,"c"),new Emp(4,"d"));
   // Long collect2 = empList.stream().collect(Col);
    //System.out.println(collect2);
    
    Map<Integer, String> itemMap = empList.stream()
            .collect(Collectors.toMap(i->i.id, item -> item.name));
    
    System.out.println(itemMap);
    
    
	
	}


}
