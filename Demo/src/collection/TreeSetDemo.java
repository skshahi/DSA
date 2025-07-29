package collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparaor implements Comparator<String>
{

	/*@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1<o2)
		{
			return 1;
		}else if(o1>o2)
		{
			return -1;
		}else
		{
			return 0;
		}		
		
	}*/
	/*@Override
	public int compare(Integer o1, Integer o2) {		
	//return -o1.compareTo(o2);	
		//return o2.compareTo(o1);
		return 1;
		
		
		
	}*/
	@Override
	public int compare(String o1, String o2) {		
	//return -o1.compareTo(o2);	
		//return o2.compareTo(o1);
		return -o1.compareTo(o2);
		
		
		
	}
	
}

public class TreeSetDemo {

	public static void main(String[] args) {
		/*TreeSet<Integer> ts=new TreeSet<>(new MyComparaor());
		ts.add(10);
		ts.add(50);
		ts.add(35);
		ts.add(20);
		ts.add(5);
		System.out.println(ts);*/
		
		TreeSet<String> str=new TreeSet<>(new MyComparaor());
		str.add("Sonu");
		str.add("atul");
		str.add("vivaan");
		str.add("shivam");
		System.out.println(str);
		
		

	}

}
