package com.ticktask.springboot.webapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ticktask.springboot.webapp.entity.User;
import com.ticktask.springboot.webapp.repositories.UserRepository;


@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	@Autowired //creates new instance of user into repo
	private UserRepository repo;

	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String showSignUpForm(ModelMap model) {
		model.addAttribute("user", new User());
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		repo.save(user);
		return "register_success";
		
	}

	//http://localhost:8080/login
//		@RequestMapping(value = "/", method = RequestMethod.GET)
//		public String getWelcomePage(ModelMap model) {
//			model.put("name", getLoggedinUsername());
//		return "welcome";
//		}
		
	
//	private String getLoggedinUsername() {
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		return authentication.getName();
//		
//	}
	



}
