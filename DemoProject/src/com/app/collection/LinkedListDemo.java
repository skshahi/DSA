package com.app.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> al=new LinkedList<>();
		al.add(10);
		al.add(12);
		al.add(20);
		al.add(30);
		al.add(14);
		al.add(54);
		al.add(32);
		
		
		System.out.println(al.offer(10));;
		
//		System.out.println(al);
//		System.out.println(al.contains(14));
//		System.out.println(); 
//		ListIterator<Integer> itr = al.listIterator();
//		while(itr.hasPrevious())
//		{
//			System.out.println(itr.previous());
//		}
//		
//		Iterator<Integer> descendingIterator = al.descendingIterator();
//		while(descendingIterator.hasNext())
//		{
//			System.out.println(descendingIterator.next());
//		}
		Integer element = al.element();
		System.out.println(element);
		
	/*	   // list of names
        List<String> names = new LinkedList<>();
        names.add("learn");
        names.add("from");
        names.add("Geeksforgeeks");

        // Getting ListIterator
        ListIterator<String> listIterator1
            = names.listIterator();

        // Traversing elements
        System.out.println("Forward Direction Iteration:");
        while (listIterator1.hasNext()) {
            System.out.println(listIterator1.next());
        }

        // Traversing elements, the iterator is at the end
        // at this point
        System.out.println("Backward Direction Iteration:");
        while (listIterator1.hasPrevious()) {
            System.out.println(listIterator1.previous());
        }*/
		
		
		
		

	}

}
