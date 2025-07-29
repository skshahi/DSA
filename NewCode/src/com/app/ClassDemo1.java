package com.app;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class User{
	String name;
	int age;
	List<String> emails;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", emails=" + emails + "]";
	}
	public User(String name, int age, List<String> emails) {
		super();
		this.name = name;
		this.age = age;
		this.emails = emails;
	}
	
	
}

public class ClassDemo1 {

	public static void main(String[] args) {
		/*
		 * List<Integer> asList = Arrays.asList(14,2,10,5,4,3,7,9);
		 * 
		 * List<Integer> sortedList =
		 * asList.stream().filter(i->i>5).sorted().collect(Collectors.toList());
		 * 
		 * System.out.println(sortedList);
		 */
		
		
		List<User> userList=Stream.of(new User("sonu", 20, Arrays.asList("s@gamil.com","b@hot.com"))
				,
				new User("atul", 25, Arrays.asList("a@gamil.com","a@hot.com")),
				new User("vivaan", 20, Arrays.asList("v@gamil.com","v@hot.com")),
				new User("shivam", 20, Arrays.asList("sh@gamil.com","bh@hot.com")),
				new User("angad", 20, Arrays.asList("ag@gamil.com","ag@hot.com")),
				new User("aman", 20, Arrays.asList("am@gamil.com","am@hot.com"))
				).toList();
		
		System.out.println(userList);
		List<List<String>> emailList = userList.stream().map(User::getEmails).collect(Collectors.toList());
	
		System.out.println(emailList);
		
		List<String> emails = userList.stream().flatMap(u->u.getEmails().stream()).collect(Collectors.toList());
		System.out.println(emails);
	}

}
