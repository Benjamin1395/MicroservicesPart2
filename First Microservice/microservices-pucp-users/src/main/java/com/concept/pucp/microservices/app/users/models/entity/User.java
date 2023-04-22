package com.concept.pucp.microservices.app.users.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name = "user")

public class User {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String Name; 
	private String LastName; 
	private String email;
	public User() {
		super();
	}
	public User(long id, String name, String lastName, String email) {
		super();
		this.id = id;
		Name = name;
		LastName = lastName;
		this.email = email;
	}
	public User(String name, String lastName, String email) {
		super();
		Name = name;
		LastName = lastName;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 

}