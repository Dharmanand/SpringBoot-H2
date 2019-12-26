package com.kd.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kd.app.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
