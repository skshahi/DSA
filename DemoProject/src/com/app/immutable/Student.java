package com.app.immutable;

//Java Program to Create An Immutable Class
import java.util.HashMap;
import java.util.Map;

//declare the class as final
final class Student {

 // make fields private and final
 private final String name;
 private final int regNo;
 private final Map<String, String> metadata;

 // initialize all fields via constructor
 public Student(String name, int regNo, Map<String, String> metadata) {
     this.name = name;
     this.regNo = regNo;

     // deep copy of mutable object (Map)
     Map<String, String> tempMap = new HashMap<>();
     for (Map.Entry<String, String> entry : metadata.entrySet()) {
         tempMap.put(entry.getKey(), entry.getValue());
     }
     this.metadata = tempMap;
 }

 // only provide getters (no setters)
 public String getName() {
     return name;
 }

 public int getRegNo() {
     return regNo;
 }

 // return deep copy to avoid exposing internal state
 public Map<String, String> getMetadata() {
     Map<String, String> tempMap = new HashMap<>();
     for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
         tempMap.put(entry.getKey(), entry.getValue());
     }
     return tempMap;
 }
 
 
 public static void main(String[] args) {

     // create a map and adding data
     Map<String, String> map = new HashMap<>();
     map.put("1", "first");
     map.put("2", "second");

     // create an immutable Student object
     Student s = new Student("GFG", 101, map);

     // accessing data
     System.out.println(s.getName());       
     System.out.println(s.getRegNo());     
     System.out.println(s.getMetadata());   

     // try to modify the original map
     map.put("3", "third");
     System.out.println(s.getMetadata());   

     // try to modify the map returned by getMetadata()
     s.getMetadata().put("4", "fourth");
     System.out.println(s.getMetadata());   
 }
}