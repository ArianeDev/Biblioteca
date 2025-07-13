package com.example.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String title;

	@Column(unique = true, nullable = false, length = 13)
	private String ISBN;

	@Column(nullable = false)
	private String category;

	@Column(nullable = false)
	private String photoURL;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private int quantity;

	@Column(nullable = false)
	private String evaluation;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "author_id")
	private Author author;

	public Book() {};

	public Book(String title, String ISBN, String category, String phoneURL, String description, int quantity, String evaluation, Author author) {
		this.title = title;
		this.ISBN = ISBN;
		this.category = category;
		this.photoURL = phoneURL;
		this.description = description;
		this.quantity = quantity;
		this.evaluation = evaluation;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getCategory() {
		return category;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getEvaluation() {
		return evaluation;
	}

	public Author getAuthor() {
		return author;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
