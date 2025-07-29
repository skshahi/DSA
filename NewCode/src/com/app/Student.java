package com.app;

import java.util.List;
import java.util.Objects;

public class Student {

    private int id;
    private String firstName;
    private int age;
    private String gender;
    private String dept;
    private String city;
    private int rank;
    private List<String> contacts;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public List<String> getContacts() {
		return contacts;
	}
	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}
	public Student(int id, String firstName, int age, String gender, String dept, String city, int rank,
			List<String> contacts) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.city = city;
		this.rank = rank;
		this.contacts = contacts;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", age=" + age + ", gender=" + gender + ", dept="
				+ dept + ", city=" + city + ", rank=" + rank + ", contacts=" + contacts + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, city, contacts, dept, firstName, gender, id, rank);
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
		return age == other.age && Objects.equals(city, other.city) && Objects.equals(contacts, other.contacts)
				&& Objects.equals(dept, other.dept) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(gender, other.gender) && id == other.id && rank == other.rank;
	}
    

}
