package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	// On click of submit button
	// URL -- http://localhost:8080/createuser
	@RequestMapping(value = "/createuser", method = RequestMethod.POST)
	public ModelAndView createUser(@ModelAttribute User user) {
		User usr = userService.createUser(user);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userdetails");
		mv.addObject("user", usr);
		return mv;
	}

	// Display user form on the browser
	// URL --- http://localhost:8080/user
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView renderUserForm(@ModelAttribute User user) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("user");
		// mv.addObject("user", usr);
		return mv;
	}

	// URL --- http://localhost:8080/deleteuser/1
	@RequestMapping(value = "/deleteuser/{id}", method = RequestMethod.GET)
	public ModelAndView deleteUserById(@PathVariable Integer id) {
		userService.deleteUserById(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("deletemsg");
		mv.addObject("msg", "Deleted Successfully");
		return mv;
	}

	// URL --- http://localhost:8080/deleteuser?id=1
	@RequestMapping(value = "/deleteuserusingparam", method = RequestMethod.GET)
	public ModelAndView deleteUserByIdUsingParam(@RequestParam("id") Integer id) {
		userService.deleteUserById(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("deletemsg");
		mv.addObject("msg", "Deleted Successfully");
		return mv;
	}

	// URL --- http://localhost:8080/deleteuserform
	@RequestMapping(value = "/deleteuserform", method = RequestMethod.GET)
	public ModelAndView renderDeleteUserForm(@ModelAttribute User user) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("deleteuserform");
		// mv.addObject("user", usr);
		return mv;
	}

	// URL --- http://localhost:8080/deleteuser
	@RequestMapping(value = "/deleteuser", method = RequestMethod.POST)
	public ModelAndView deleteUserById(@ModelAttribute User user) {
		userService.deleteUserById(user.getUserId());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("deletemsg");
		mv.addObject("msg", "Deleted Successfully");
		return mv;
	}

	// URL --- http://localhost:8080/searchalluser
	@RequestMapping(value = "/searchalluser", method = RequestMethod.GET)
	public ModelAndView searchAllUsers() {
		List<User> users = userService.searchAllUsers();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userdetails");
		mv.addObject("user", users);
		return mv;
	}
	
	// URL --- http://localhost:8080/searchUserByName/OSAMA
		@RequestMapping(value = "/searchUserByName/{name}", method = RequestMethod.GET)
		public ModelAndView searchUserByName(@PathVariable String name) {
			User usr = userService.searchUserByName(name);
			ModelAndView mv = new ModelAndView();
			mv.setViewName("userdetails");
			mv.addObject("user", usr);
			return mv;
		}
		//URL --- http://localhost:8080/searchRole/OSAMA
		@RequestMapping(value = "/searchRole/{name}", method = RequestMethod.GET)
		public ModelAndView searchRole(@PathVariable String role) {
			User usr = userService.searchRole(role);
			ModelAndView mv = new ModelAndView();
			mv.setViewName("userdetails");
			mv.addObject("user", usr);
			return mv;
		}
}


