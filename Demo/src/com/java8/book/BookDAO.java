package com.java8.book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public List<Book> getBooks()
	{
		List<Book> bookList=new ArrayList<>();
		bookList.add(new Book(1, "Spring", 250));
		bookList.add(new Book(2, "Java", 350));
		bookList.add(new Book(3, "Hibernete", 150));
		bookList.add(new Book(4, "Oracle", 200));
		bookList.add(new Book(5, "React", 300));
		return bookList;
	}

}
