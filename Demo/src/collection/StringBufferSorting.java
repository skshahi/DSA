package collection;

import java.util.Comparator;
import java.util.TreeSet;
class MyCom implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		
		return o1.toString().compareTo(o2.toString());
	}

	
	
}

public class StringBufferSorting {

	public static void main(String[] args) {
	
		TreeSet t=new TreeSet(new MyCom());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("C"));
		t.add(new StringBuffer("D"));
		t.add("P");
		System.out.println(t);

	}

}
