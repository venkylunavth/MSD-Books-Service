package com.New.Project.Spring.Book.Controller;

import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.New.Project.Spring.Book.Model.Books;
import com.New.Project.Spring.Book.repository.bookRepository;
import com.New.Project.Spring.Book.service.BookService;
import com.google.gson.Gson;

import lombok.Builder;

@Builder
@RestController
public class BookController {
	
	@Autowired
	BookService bookservice;
	
	
	  @GetMapping("/")
	  public String home() {
		 return "book service Home page";
	  }
	  
	  @PostMapping("/addbooks")
	  public String addBook(int id, String name,String author) {
		  bookservice.addBook(Books.builder().id(id).name(name).author(author).build());
		 return "book added";
	  }
	  @GetMapping("/getbooks")
	  public String getAll() {
		  Gson gson=new Gson();
		  String json=gson.toJson(bookservice.getAll());
		return json;
		  
	  }
	  @GetMapping("/deletebooks")
	  public String deleteBook(int id) {
		  bookservice.deleteBook(id);
		 return "book deleted";
	  }
	  
}
