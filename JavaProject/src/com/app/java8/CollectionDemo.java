package com.app.java8;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//class Employee implements Serializable
class Employee implements Externalizable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	//no need of transient key if you are using Externalizable
	//private transient String name;
	private  String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
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
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		in.readInt();
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		
	}
	
}

public class CollectionDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//C:\Users\Vivaan Shahi\Project-2025\Notes\myFile.ser
		String basePath="C:\\Users\\Vivaan Shahi\\Project-2025\\Notes\\myFile.ser";
		Employee emp=new Employee();
		emp.setId(2);
		emp.setName("Sonu");
		//Serialization
		FileOutputStream fos=new FileOutputStream(basePath);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		fos.close();
		oos.close();
		
		//Deserialization
		FileInputStream fis=new FileInputStream(basePath);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee empStream = (Employee) ois.readObject();
		System.out.println(empStream.getId()+"-"+empStream.getName());
		
	

	}

}
