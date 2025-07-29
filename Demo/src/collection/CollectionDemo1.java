package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class CollectionDemo1 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		boolean empty = c.isEmpty();
		Iterable i;
		List l;
	
		Set s;
		Map p;
		ArrayList al;
		LinkedList ll;
		Vector v;
		Stack sk;
		Set set;
		HashSet hs=new HashSet<>();
		System.out.println(hs.add(10));;
		System.out.println(hs.add(10));;
		System.out.println(hs.add(null));;
		System.out.println(hs.add(null));;
		System.out.println(hs);

	}

}
