package com.example.springrest.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import com.example.springrest.model.User;

@Component
public interface UserJpaRepository extends PagingAndSortingRepository<User,Long> {
	List<User> findByName(String name);
}
