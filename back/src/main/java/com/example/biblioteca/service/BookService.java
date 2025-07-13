package com.example.biblioteca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.biblioteca.exceptions.NotFoundException;
import com.example.biblioteca.model.Author;
import com.example.biblioteca.model.Book;
import com.example.biblioteca.repository.AuthorRepository;
import com.example.biblioteca.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;
	private AuthorRepository authorRepository;

	public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
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
		Long authorId = book.getAuthor().getId();

		// busca o autor no banco
		Author author = authorRepository.findById(authorId)
										.orElseThrow(() -> new RuntimeException("Autor com ID "+authorId+" não encontrado"));

		// atualiza o livro com as informações do autor
		book.setAuthor(author);

		//salva as informações
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
