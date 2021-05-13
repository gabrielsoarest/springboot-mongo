package br.com.organizaae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.organizaar.model.User;

public interface UserRepository  extends MongoRepository<User, String>{

}
