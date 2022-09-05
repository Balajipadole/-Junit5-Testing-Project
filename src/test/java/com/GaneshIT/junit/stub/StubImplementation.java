package com.GaneshIT.junit.stub;

import java.util.ArrayList;
import java.util.List;

public class StubImplementation implements BookRepository{

	@Override
	public List<Book> findNewBooks(int days) {
		
		List<Book>bookList = new ArrayList<>();
		
		Book book1 = new Book("20","Science",400);
		Book book2 = new Book("50","Geograpy",100);
		
		bookList.add(book1);
		bookList.add(book2);
		return bookList;
	}

}
