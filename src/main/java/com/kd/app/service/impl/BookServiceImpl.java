package com.kd.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kd.app.model.Book;
import com.kd.app.repository.BookRepository;
import com.kd.app.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;

	@Override
	public Page<Book> getAllBooks(Pageable pageable) {
		return bookRepo.findAll(pageable);
	}

	@Override
	public Book getBook(Integer bookId) {
		return bookRepo.getOne(bookId);
	}

	@Override
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public Book updateBook(Integer bookId, Book bookRequest) {
		Book book = bookRepo.getOne(bookId);
		book.setId(bookRequest.getId());
		book.setAuthors(bookRequest.getAuthors());
		book.setDescription(bookRequest.getDescription());
		book.setTitle(bookRequest.getTitle());
		return bookRepo.save(book);
	}

	@Override
	public void deleteBook(Integer bookId) {
		bookRepo.delete(bookRepo.getOne(bookId));
	}

}
