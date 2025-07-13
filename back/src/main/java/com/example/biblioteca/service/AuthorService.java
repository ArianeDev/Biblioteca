package com.example.biblioteca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.biblioteca.exceptions.NotFoundException;
import com.example.biblioteca.model.Author;
import com.example.biblioteca.repository.AuthorRepository;

@Service
public class AuthorService {
	
	private final AuthorRepository authorRepository;

	public AuthorService(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	public List<Author> authors_get() {
		return authorRepository.findAll();
	}

	public Author author_get(Long id) {
		return authorRepository.findById(id)
							   .orElseThrow(() -> new NotFoundException("Autor com o ID "+id+" não encontrado"));
	}

	public Author author_post(Author author) {
		return authorRepository.save(author);
	}

	public void author_delete(Long id) {
		if (!authorRepository.existsById(id)) {
			throw new NotFoundException("Autor com o ID "+id+" não encontrado");
		}
		authorRepository.deleteById(id);
	}
}
