package com.example.restfull.service;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restfull.exceptions.NoUsersFoundException;
import com.example.restfull.exceptions.UserAlreadyExistException;
import com.example.restfull.exceptions.UserNotFoundException;
import com.example.restfull.model.User;
import com.example.restfull.repositories.UserRepository;



@Service
public class UserServiceImpl implements UserService {
	private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);
	@Autowired
	UserRepository userRepo;

	@Override
	public User createUser(User user) throws UserAlreadyExistException {
		User usr = userRepo.findByUserName(user.getUserName());
		if (usr != null) {
			logger.warn("username already exist in the database "+user.getUserName());
			throw new UserAlreadyExistException();
		} else {
			User us = userRepo.save(user);
			logger.info("User created successfully with user id --- "+us.getUserId());
			return us;
		}
	}

	@Override
	public User findUserById(Integer userId) throws UserNotFoundException {
		Optional<User> user = userRepo.findById(userId);
		if (user.isPresent()) {
			return user.get();
		} else {
			throw new UserNotFoundException();
		}

	}

	@Override
	public String deleteUserById(Integer userId) throws UserNotFoundException {
		Boolean isUserExist = userRepo.existsById(userId);
		if (isUserExist) {
			userRepo.deleteById(userId);
			return "Deleted successfully";
		} else {
			throw new UserNotFoundException();
		}

	}

	@Override
	public String updateUser(User user) throws UserNotFoundException {

		if (userRepo.existsById(user.getUserId())) {
			User usr = userRepo.save(user);
			return "User record updated successfully";
		} else {
			throw new UserNotFoundException("Unable to update the user data");
		}
		// return "Unable to update the user data";
	}

	@Override
	public User searchUserByName(String userName) throws UserNotFoundException {
		User user = userRepo.findByUserName(userName);
		if(user != null) {
			return user;
		} else {
			logger.error("User doesn't exist with username --- "+userName);
			throw new UserNotFoundException();
		}

	}

	@Override
	public List<User> searchAllUsers() throws NoUsersFoundException{
		List<User> users = (List<User>) userRepo.findAll();
		if(users !=null) {
			return users;
		}else {
			throw new NoUsersFoundException();
		}
		
	}

	@Override
	public List<User> findAllSortedByName() throws NoUsersFoundException {
		List<User> users = (List<User>) userRepo.findAllSortedByName();
		if(users !=null) {
			return users;
		}else {
			logger.error("Users doesn't exist");
			throw new NoUsersFoundException();
		}
		
	}

	@Override
	public User findByRole(String role) throws UserNotFoundException {
		User user = userRepo.findByRole(role);
		if(user != null) {
			return user;
		} else {
			throw new UserNotFoundException();
		}

	}

}
