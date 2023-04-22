package com.concept.pucp.microservices.app.users.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concept.pucp.microservices.app.users.models.entity.User;
import com.concept.pucp.microservices.app.users.models.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired UserRepository repository;
	
	@Override
	public Iterable<User> findAll() {
	
		return repository.findAll();
	}

	@Override
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public User save(User user) {
		
		return repository.save(user);
	}

	@Override
	public void deleteByid(Long id) {
		repository.deleteById(id);

	}

}

