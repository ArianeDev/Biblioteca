package com.example.biblioteca.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "authors")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private LocalDate birth_date;

	@Column(nullable = true)
	private String nationality;

	// O construtor vazio é obrigatório porque frameworks como JPA e Jackson precisam dele para instanciar objetos automaticamente via reflexão antes de preencher os campos.
	public Author() {}

	public Author(String name, LocalDate birth_date, String nationality) {
		this.name = name;
		this.birth_date = birth_date;
		this.nationality = nationality;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirth_date() {
		return birth_date;
	}

	public String getNationality() {
		return nationality;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirth_date(LocalDate birth_date) {
		this.birth_date = birth_date;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}
