package com.GaneshIT.junit.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.GaneshIT.junit.fake.Book;
import com.GaneshIT.junit.fake.BookRepository;
import com.GaneshIT.junit.fake.BookService;
import com.GaneshIT.junit.fake.FakeBookRepository;

public class TestBookServiceDummy {

	public void TestSaveBook() {
		
	BookRepository bookRepository = new FakeBookRepository();
	DummyEmailService emailService = new DummyEmailService();
	BookService bookService = new BookService(bookRepository);
	
	Book book1 = new Book("100", "English", 250);
	Book book2 = new Book("101", "Psychology", 200);
	
	bookService.saveBook(book1);
	bookService.saveBook(book2);
	
	assertEquals(2, bookService.findNumberOfBooks());
	
	}
}
	
