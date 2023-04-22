package com.concept.pucp.microservices.app.users.services;

import java.util.Optional;

import com.concept.pucp.microservices.app.users.models.entity.User;

public interface UserService {
	
	public Iterable<User> findAll();

	public Optional<User> findById(Long id);
	
	public User save (User user);
	
	public void deleteByid (Long id);
}
