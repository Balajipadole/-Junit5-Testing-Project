package com.GaneshIT.junit.fake;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestFakeWithAnnotation {

//	BookRepository bookRepository = mock(BookRepository.class);
//	
//    BookService testobj = new BookService(bookRepository);
//    
//    @Test
//    public void TestsaveBook() {
//    	Book book1 = new Book("11", "HalfGirlFriend",280);
//    	doNothing().when(bookRepository).save(book1);//void
//    //Not anything return(void)thats why use doNothing()method.
//    	testobj.saveBook(book1);
//    	
//    }
	@Mock
	private BookRepository bookRepository;
	
	@InjectMocks
	BookService testobj;
	
	@Test
	public void TestsaveBook() {
		Book book1 = new Book("11", "HalfGirlFriend",280);
    	doNothing().when(bookRepository).save(book1);//void    //Not anything return(void)thats why use doNothing()method.
    	testobj.saveBook(book1);
    		
	}
}
