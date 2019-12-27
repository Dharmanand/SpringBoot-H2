package com.kd.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kd.app.model.Author;
import com.kd.app.repository.AuthorRepository;
import com.kd.app.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	private AuthorRepository authorRepo;
	
	@Override
	public Page<Author> getAllAuthors(Pageable pageable) {
		return authorRepo.findAll(pageable);
	}

	@Override
	public Author getAuthor(Integer authorId) {
		return authorRepo.getOne(authorId);
	}

	@Override
	public Author createAuthor(Author author) {
		return authorRepo.save(author);
	}

	@Override
	public Author updateAuthor(Integer authorId, Author authorRequest) {
		Author author = authorRepo.getOne(authorId);
		author.setAuth_id(authorRequest.getAuth_id());
		author.setBooks(authorRequest.getBooks());
		author.setName(authorRequest.getName());
		return authorRepo.save(author);
	}

	@Override
	public void deleteAuthor(Integer authorId) {
		authorRepo.delete(authorRepo.getOne(authorId));
	}

}
