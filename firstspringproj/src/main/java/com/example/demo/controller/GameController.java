//package com.example.demo.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class GameController {
//	@RequestMapping(value="/game",method=RequestMethod.GET)
//	public ModelAndView greetings(@RequestParam("game") String game) {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("game");
//		
//		mv.addObject("msg1", "the name of the game is "+game +" !");
//		return mv;
//	}
//	//URL --- http://localhost:8080/greeting?name="Shashank"
//		@RequestMapping(value="/greeting",method=RequestMethod.GET)
//		public ModelAndView greeting(@RequestParam("name") String name) {
//			ModelAndView mv = new ModelAndView();
//			mv.setViewName("hello");
//			mv.addObject("msg", "Hi how you "+name+" !!");
//			return mv;
//		}
//		//URL -- http://localhost:8080/greet/Sonu
//		@RequestMapping(value="/greet/{name}",method=RequestMethod.GET)
//		public ModelAndView greet(@PathVariable String name) {
//			ModelAndView mv = new ModelAndView();
//			mv.setViewName("hello");
//			mv.addObject("msg", "Yo whats up "+name+" !!");
//			return mv;
//		}
//		
//		//URL -- http://localhost:8080/greet/Sonu
//				@RequestMapping(value="/user",method=RequestMethod.GET)
//				public ModelAndView createMarks(@RequestBody String name) {
//					ModelAndView mv = new ModelAndView();
//					mv.setViewName("hello");
//					mv.addObject("msg", "Yo whats up "+name+" !!");
//					return mv;
//				}
//
//
//}
