package br.com.organizaae.service;

import java.util.List;

import br.com.organizaar.model.User;

/**
 * @author Gabriel
 */
public interface UserService {
	
	/**
	 * Save an user 
	 * @param user-user
	 */
	public void createUser(User user);
	
	/**
	 * Get an user by Id
	 * @param id-id
	 * @return an user object 
	 */
	public User getUserById(String id);
	
	/**
	 * Get all user avaiable
	 * @return list if users
	 */
	public List<User> getAllUsers();

}
