package com.example.biblioteca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.biblioteca.exceptions.NotFoundException;
import com.example.biblioteca.model.Book;
import com.example.biblioteca.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	// Listar todos os livros
	public List<Book> books_get() {
		return bookRepository.findAll();
	}

	// Listar um livro específico
	public Book book_get(Long id) {
		return bookRepository.findById(id)
							 .orElseThrow(() -> new NotFoundException("Livro com o ID "+id+" não encontrado"));
	}

	// Cadastrar um livro
	public Book book_post(Book book) {
		return bookRepository.save(book);
	}

	// Deletar um livro
	public void book_delete(Long id) {
		if (!bookRepository.existsById(id)) {
			throw new NotFoundException("Livro com o ID "+id+" não encontrado");
		}
		bookRepository.deleteById(id);
	}

}
