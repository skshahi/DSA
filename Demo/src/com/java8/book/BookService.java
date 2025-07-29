package com.java8.book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//way1
/*class MyBookComparator implements Comparator<Book>
{

	@Override
	public int compare(Book o1, Book o2) {
		
		return o2.name.compareTo(o1.name);
	}
	
}*/

public class BookService {
	
	public List<Book> getBookInSort()
	{
		List<Book> booksList=new BookDAO().getBooks();
		
		//way1
		//Collections.sort(booksList, new MyBookComparator());
		
		//way2
		/*Collections.sort(booksList, new Comparator<Book>(){

			@Override
			public int compare(Book o1, Book o2) {
				
				return o2.name.compareTo(o1.name);
			}		
			
		});*/
		
				
			
		
		//way3
		/*Comparator<Book> bComparator=( o1,  o2) ->{				
			return o2.name.compareTo(o1.name);
		};
	    Collections.sort(booksList, bComparator);*/
		
	    //way4				
		Collections.sort(booksList, (o1,o2) ->o2.name.compareTo(o1.name));
		
		return booksList;
		
	}
	
	public static void main(String[] args) {
		System.out.println(new BookService().getBookInSort());
	}

}
