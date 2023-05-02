package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloWorldController{
	@RequestMapping(value="/greetings",method=RequestMethod.GET)
	public ModelAndView greetings(@RequestParam("name") String name) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("msg", "Hi how are you "+name+" !");
		return mv;
	}
}