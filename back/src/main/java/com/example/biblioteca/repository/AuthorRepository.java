package com.example.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.biblioteca.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
	
}
