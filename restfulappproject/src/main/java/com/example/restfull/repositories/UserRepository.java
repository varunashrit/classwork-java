package com.example.restfull.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.restfull.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public User findByUserName(String userName);
	public User findByRole(String role);
	
	 @Query(value = "SELECT u FROM User u ORDER BY userName")
	 public List<User> findAllSortedByName();
}

