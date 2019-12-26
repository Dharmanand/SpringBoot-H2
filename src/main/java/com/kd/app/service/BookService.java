package com.kd.app.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kd.app.model.Book;

@Service
public interface BookService {
	
	Page<Book> getAllBooks(Pageable pageable);
	Book getBook(Integer bookId);
	Book createBook(Book book);
	Book updateBook(Integer bookId, Book bookRequest);
	void deleteBook(Integer bookId);

}
