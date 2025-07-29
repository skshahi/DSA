package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
//		Hashtable<Integer,String> hm=new Hashtable<>();
//		hm.put(10, "sonu");
//		hm.put(11, "vivaan");
//		hm.put(12, "atul");
//		hm.put(12, "aman");
//		hm.put(14, null);
//		System.out.println(hm);
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(25);
		al.add(48);
		al.add(23);
		al.add(15);
		
		Integer[]a={1,2,4,5,7,8,7,9,3,30,5};
		
		 List<Integer> asList =Arrays.asList(a);
		 
		System.out.println(asList);
		Collections.rotate(asList, -2);
		System.out.println(asList);
		
		 Integer max = Collections.min(al);
		System.out.println(max);
		System.out.println(al);
		Collections.rotate(al, 2);
		System.out.println(al);
		int frequency = Collections.frequency(al, 15);
		System.out.println(frequency);
		//Collections.
		Object[] array = al.toArray();
		//Arrays.spliterator(al)
		

	}

}
