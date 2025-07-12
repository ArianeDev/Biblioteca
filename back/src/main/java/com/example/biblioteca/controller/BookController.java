package com.example.biblioteca.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca.model.Book;
import com.example.biblioteca.service.BookService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/books")
public class BookController {
	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping()
	public List<Book> books_get() {
		return bookService.books_get();
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> book_get(@PathVariable Long id) {
		Book book = bookService.book_get(id);
		return ResponseEntity.ok(book);
	}

	@PostMapping()
	public Book book_post(@RequestBody Book book) {
		return bookService.book_post(book);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> book_delete(@PathVariable Long id) {
		bookService.book_delete(id);
		return ResponseEntity.noContent().build();
	}	
	
}
