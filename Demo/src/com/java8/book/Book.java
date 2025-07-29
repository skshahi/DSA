package com.java8.book;

public class Book {
	int bookId;
	String name;
	int  pages;
	public Book(int bookId, String name, int pages) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", pages=" + pages + "]";
	}
	public Book() {
		super();
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	

}
