package com.GaneshIT.junit.fake;

public class BookService {

	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
	super();
	this.bookRepository = bookRepository;
}
	public void saveBook(Book book) {
		
		bookRepository.save(book);
	}
	public int findNumberOfBooks() {
		
		return bookRepository.findAll().size();
	}
}
