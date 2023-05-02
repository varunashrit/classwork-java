package com.example.restfull.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfull.exceptions.NoUsersFoundException;
import com.example.restfull.exceptions.UserAlreadyExistException;
import com.example.restfull.exceptions.UserNotFoundException;
import com.example.restfull.model.User;
import com.example.restfull.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	//http://localhost:8080/addUser
	@PostMapping("/addUser")
	public User createUser(@RequestBody User user) throws UserAlreadyExistException{
		return userService.createUser(user);
	}
	
	@GetMapping("/searchuserbyid/{id}")
	public User findUserById(@PathVariable("id") Integer userId) throws UserNotFoundException {
		return userService.findUserById(userId);
	}
	
	@GetMapping("/deleteuserbyid/{id}")
	public String deleteUserById(@PathVariable("id") Integer userId) throws UserNotFoundException{
		return userService.deleteUserById(userId);
	}
	
	@PostMapping("/updateuser")
	public String updateUser(@RequestBody User user) throws UserNotFoundException{
		return userService.updateUser(user);
	}
	
	@GetMapping("/searchuserbyname")
	public User searchUserByName(@RequestParam("name") String userName) throws UserNotFoundException{
		return userService.searchUserByName(userName);
	}
	
	@GetMapping("/allusers")
	public List<User> searchAllUsers() throws NoUsersFoundException{
		return userService.searchAllUsers();
	}
	
	@GetMapping("/allsortedusers")
	public List<User> findAllSortedByName() throws NoUsersFoundException{
		return userService.findAllSortedByName();
	}
	
	@GetMapping("/searchbyrole")
	public User findByRole(@RequestParam("role") String role) throws UserNotFoundException {
		return userService.findByRole(role);
	}
}
