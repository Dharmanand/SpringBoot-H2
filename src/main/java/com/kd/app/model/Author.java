package com.kd.app.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javassist.SerialVersionUID;

@Entity
public class Author {

	private static final long SerialVersionUID = 4L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer auth_id;

    private String name;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    public Integer getAuth_id() {
		return auth_id;
	}

	public void setAuth_id(Integer auth_id) {
		this.auth_id = auth_id;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
	
}
