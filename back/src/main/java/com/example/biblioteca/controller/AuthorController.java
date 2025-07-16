package com.example.biblioteca.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca.model.Author;
import com.example.biblioteca.service.AuthorService;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/author")
public class AuthorController {
	
	private final AuthorService authorService;

	public AuthorController(AuthorService authorService) {
		this.authorService = authorService;
	}

	@GetMapping()
	public List<Author> authors_get() {
		return authorService.authors_get();
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> book_get(@PathVariable Long id) {
		Author author = authorService.author_get(id);
		return ResponseEntity.ok(author);
	}

	@PostMapping()
	public Author author_post(@RequestBody Author author) {
		return authorService.author_post(author);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> book_delete(@PathVariable Long id) {
		authorService.author_delete(id);
		return ResponseEntity.noContent().build();
	}
	
}
