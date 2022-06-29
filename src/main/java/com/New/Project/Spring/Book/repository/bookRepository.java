package com.New.Project.Spring.Book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.New.Project.Spring.Book.Model.Books;

public interface bookRepository extends JpaRepository<Books, Integer>{

}
