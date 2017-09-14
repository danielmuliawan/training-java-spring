package com.example.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.model.User;
import com.example.springrest.repository.UserJpaRepository;

@RestController
@RequestMapping("/employee")
public class UserController {

	@Autowired
	private UserJpaRepository userJpaRepository; 
	
	@GetMapping(value="")
	public Page<User> findAll(Pageable p) {
		return userJpaRepository.findAll(p);
	}
	
	@GetMapping(value="/+{id}")
    public User findById(@PathVariable Long id) {
		return userJpaRepository.findOne(id);
    }
	 
	public User findByName() {
		return null;
	}
	
	@PostMapping(value = "/load")
	public User load(@RequestBody final User user) {
		User u = userJpaRepository.save(user);
		return u;
	}
}
