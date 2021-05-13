package br.com.organizaae.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.organizaae.repository.UserRepository;
import br.com.organizaae.service.UserService;
import br.com.organizaar.model.User;

@Service
public class UserImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	/**
	 *{@inheritDoc}
	 */
	@Override
	public void createUser(User user) {
		this.userRepository.save(user);
		
	}

	/**
	 *{@inheritDoc}
	 */
	@Override
	public User getUserById(String id) {
		return this.userRepository.
			findById(id)
			.orElseThrow(()->new IllegalArgumentException("Usuario nao encontrado"));
		
	}

	/**
	 *{@inheritDoc}
	 */
	@Override
	public List<User> getAllUsers() {
		return this.userRepository.findAll();
		
	}

}
