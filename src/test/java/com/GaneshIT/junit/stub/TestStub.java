package com.GaneshIT.junit.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TestStub {

	BookRepository bookRepository = new StubImplementation();
	BookService service = new BookService(bookRepository);
	
	@Test
	public void TestgetNewBookWithAppliedDiscount() {
		
	List<Book> list = service.getNewBookWithAppliedDiscount(10,5);
	
	assertEquals(2, list.size());
	assertEquals(360,list.get(0).getPrice());
	assertEquals(90,list.get(1).getPrice());
	}
}
