package com.GaneshIT.junit.mockito.verify;

import static org.mockito.Mockito.atLeast;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestMockitoVerify {

	@Mock
	BookRepository bookRepository;
	
	@InjectMocks
	BookService testObject;
	
	@Test
	public void Test1() {
		
		Book book1 = new Book("200", "Hindi",500);
		Book book2 = new Book("100", "Goemetry",400);
		
		testObject.saveBook(book1);
		testObject.saveBook(book2);
		
//		Mockito.verify(bookRepository).save(book1);
//		Mockito.verify(bookRepository).save(book2);
//		
		Mockito.verify(bookRepository,Mockito.times(4)).save(book1);

		Mockito.verify(bookRepository,Mockito.times(4)).save(book2);
	}
//	@Test
//	public void TestAtleast() {
//
//		Book book1 = new Book("200", "Hindi",500);
//		Book book2 = new Book("100", "Goemetry",400);
////		
//		testObject.saveBook(book1);
//		testObject.saveBook(book2);
		
//	Mockito.verify(bookRepository, atLeast(2)).save(book1);
//	Mockito.verify(bookRepository, atLeast(0)).save(book2);
	
	}

