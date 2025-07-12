package com.example.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 255)
	private String name;

	@Column(nullable = false)
	private String email;

	@OneToOne(optional = false)
	@JoinColumn(name = "address_id")
	private Address address;

	@Column(nullable = false)
	private String password;
	
	public User(String name, String email, Address address, String password) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Address getAddress() {
		return address;
	}

	public String getPassword() {
		return password;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
