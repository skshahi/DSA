package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		Map<Integer, String> hms= Collections.synchronizedMap(hm);
		hm.put(1, "A");
		hm.put(2, "p");
		hm.put(3, "o");
		hm.put(4, "y");
		hm.put(1, "t");
		hm.put(null, null);
		hm.put(9, null);
		hm.put(null, "e");
		System.out.println(hm);
		System.out.println(hms);
		

	}

}
