package com.kd.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kd.app.model.Author;
import com.kd.app.model.Book;
import com.kd.app.service.AuthorService;
import com.kd.app.service.BookService;

@RestController
public class AuthorBookController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private AuthorService authorService;
	
	@PostMapping("/createBook")
	public ResponseEntity<Book> createBook(@RequestBody Book book){
		return ResponseEntity.status(HttpStatus.CREATED).body(bookService.createBook(book));
	}
	
	@PostMapping("/createAuthor")
	public ResponseEntity<Author> createAuthor(@RequestBody Author author){
		return ResponseEntity.status(HttpStatus.CREATED).body(authorService.createAuthor(author));
	}

}
