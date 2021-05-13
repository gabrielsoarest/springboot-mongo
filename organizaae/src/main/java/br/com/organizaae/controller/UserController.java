package br.com.organizaae.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.organizaae.service.UserService;
import br.com.organizaar.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public void createUser(@RequestBody User user) {
		this.userService.createUser(user);
	}
	
	@GetMapping("/{codigo}")
	public User getUser(@PathVariable String id){
		return this.userService.getUserById(id);
	}
	
	@GetMapping
	public List<User>getAllUsers(){
		return this.userService.getAllUsers();
	}
	
}
