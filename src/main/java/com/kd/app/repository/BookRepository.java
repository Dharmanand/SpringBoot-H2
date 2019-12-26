package com.kd.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kd.app.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
