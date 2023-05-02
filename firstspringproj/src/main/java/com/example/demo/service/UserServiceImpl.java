package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;

import java.util.List;




@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepo;
	
	@Override
	public User createUser(User user) {
		
		return userRepo.save(user);
	}

	@Override
	public User findUserById(Integer userId) {
		Optional<User> user =userRepo.findById(userId);
		if(user.isPresent()) {
			return user.get();
		}
		return null;
	}

	@Override
	public void deleteUserById(Integer userId) {
		userRepo.deleteById(userId);

	}

	@Override
	public String updateUser(User user) {
		
		if(userRepo.existsById(user.getUserId())) {
			User usr = userRepo.save(user);
			if(usr != null) {
			return "User record updated successfully";
			}
		}
		return "Unable to update the user data";
	}

	@Override
	public User searchUserByName(String userName) {
		//TODO
		return userRepo.findByUserName(userName);
	}

	@Override
	public List<User> searchAllUsers() {
		
		return (List<User>) userRepo.findAll();
	}

	@Override
	public User searchRole(String role) {
		
		return userRepo.findByRole(role);
	}

}
