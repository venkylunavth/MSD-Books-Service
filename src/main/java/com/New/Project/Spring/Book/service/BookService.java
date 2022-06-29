package com.New.Project.Spring.Book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.New.Project.Spring.Book.Model.Books;
import com.New.Project.Spring.Book.repository.bookRepository;

@Service
public class BookService {
	@Autowired
	bookRepository bp;
	public void addBook(Books book) {
		bp.save(book);
	}
	public List<Books> getAll(){
		return bp.findAll();
	}
	public void deleteBook(int id) {
		bp.delete(Books.builder().id(id).build());
	}

}
