package com.GaneshIT.junit.stub;

import java.util.List;

public class BookService {
	
	private BookRepository bookRepository;
	
	public BookService (BookRepository bookRepository) {
	
	super();
	this.bookRepository = bookRepository;
}
	
public List<Book> getNewBookWithAppliedDiscount(int discountRate,int days){
		
		List<Book> newBooks = bookRepository.findNewBooks(days);
	
		for(Book book : newBooks) {
			 
	int price = book.getPrice();
	int newPrice = price - (discountRate*price/100);
	book.setPrice(newPrice);
	
	}return newBooks;
	
	}
}


