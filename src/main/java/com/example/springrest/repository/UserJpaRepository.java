package com.example.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.springrest.model.User;

@Component
public interface UserJpaRepository extends JpaRepository<User,Long> {
	
}
