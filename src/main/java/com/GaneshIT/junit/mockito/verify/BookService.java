package com.GaneshIT.junit.mockito.verify;

import java.util.List;

public class BookService {
	
	private BookRepository bookRepository;
	
	public BookService (BookRepository bookRepository) {
	
	super();
	this.bookRepository = bookRepository;
}
	public void saveBook(Book book) {
	
		for(int i=0; i<4; i++) {
			bookRepository.save(book);
		}
		
	}
}



