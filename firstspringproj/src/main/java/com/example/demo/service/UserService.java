package com.example.demo.service;


import java.util.List;

import com.example.demo.model.User;



public interface UserService {
	
	public User createUser(User user);
	
	public User findUserById(Integer userId);
	
	public void deleteUserById(Integer userId);
	
	public String updateUser(User user);
	
	public User searchUserByName(String userName);
	public User searchRole(String role);
	
	public List<User> searchAllUsers();
}


