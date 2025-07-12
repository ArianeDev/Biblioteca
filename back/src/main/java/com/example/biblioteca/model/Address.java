package com.example.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String street;

	@Column(nullable = false)
	private int number;

	@Column(nullable = true)
	private String addition;

	public Address(String street, int number, String addition) {
		this.street = street;
		this.number= number;
		this.addition = addition;
	}

	public Long getId() {
		return id;
	}

	public String getStreet() {
		return street;
	}

	public int getNumber() {
		return number;
	}

	public String getAddition() {
		return addition;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setAddition(String addition) {
		this.addition = addition;
	}
}
