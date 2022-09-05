package com.GaneshIT.junit.fake;

import java.util.Collection;
import java.util.HashMap;

public class FakeBookRepository implements BookRepository {

	HashMap<String,Book> hm = new HashMap<>();
	
	@Override
	public void save(Book book) {
     hm.put(book.getId(), book);
	}

	@Override
	public Collection<Book> findAll() {
		
		return hm.values();
	}

	
}
