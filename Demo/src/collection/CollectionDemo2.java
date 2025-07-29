package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CollectionDemo2 {

	public static void main(String[] args) {
		/*ArrayList<Integer> al=new ArrayList<>();
		for(int  i=0;i<10;i++)
		{
			al.add(i);
		}
		Iterator<Integer> iterator = al.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}*/
		
		Vector<Integer> v=new Vector<>();
		for(int i=0;i<10;i++)
		{
			v.addElement(i);
		}
		Enumeration<Integer> elements = v.elements();
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
		}
			

	}

}
