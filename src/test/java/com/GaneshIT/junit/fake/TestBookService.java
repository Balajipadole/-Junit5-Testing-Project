package com.GaneshIT.junit.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestBookService {
    
	@Test
	public void TestSaveBook() {
	
		BookRepository bookRepository = new FakeBookRepository();
		BookService bookService = new BookService(bookRepository);
		
		Book book1 = new Book("100", "English", 250);
		Book book2 = new Book("101", "Psychology", 200);
		
		bookService.saveBook(book1);
		bookService.saveBook(book2);
		
		assertEquals(2, bookService.findNumberOfBooks());
		
	}
}
