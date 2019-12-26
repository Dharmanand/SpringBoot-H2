package com.kd.app.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kd.app.model.Author;

@Service
public interface AuthorService {
	
	Page<Author> getAllAuthors(Pageable pageable);
	Author getAuthor(Integer authorId);
	Author createAuthor(Author author);
	Author updateAuthor(Integer authorId, Author authorRequest);
	void deleteAuthor(Integer authorId);

}
