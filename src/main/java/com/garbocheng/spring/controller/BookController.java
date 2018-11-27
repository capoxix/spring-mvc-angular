package com.garbocheng.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garbocheng.spring.model.Book;
import com.garbocheng.spring.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	//Get all the book
	@GetMapping("/api/book")
	public ResponseEntity<List<Book>> list(){
		List<Book> list = bookService.list();
		return ResponseEntity.ok().body(list);
	}
}