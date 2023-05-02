package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public User findByUserName(String userName);
	public User findByRole(String role);
	
}
