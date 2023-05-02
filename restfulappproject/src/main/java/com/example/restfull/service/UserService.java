package com.example.restfull.service;


import java.util.List;

import com.example.restfull.exceptions.NoUsersFoundException;
import com.example.restfull.exceptions.UserAlreadyExistException;
import com.example.restfull.exceptions.UserNotFoundException;
import com.example.restfull.model.User;


public interface UserService {
	
public User createUser(User user) throws UserAlreadyExistException;
	
	public User findUserById(Integer userId) throws UserNotFoundException;
	
	public String deleteUserById(Integer userId) throws UserNotFoundException;
	
	public String updateUser(User user)  throws UserNotFoundException;;
	
	public User searchUserByName(String userName) throws UserNotFoundException;
	
	public List<User> searchAllUsers() throws NoUsersFoundException ;
	
	public List<User> findAllSortedByName() throws NoUsersFoundException ;
	
	public User findByRole(String role) throws UserNotFoundException;

}
