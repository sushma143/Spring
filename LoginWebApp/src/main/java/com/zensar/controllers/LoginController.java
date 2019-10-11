package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zensar.entities.User;
import com.zensar.services.UserServices;

@Controller//Request Processor Component
public class LoginController {
	
	@Autowired
	private UserServices userService;
	@RequestMapping("login")
	public String checkLogin(User user, ModelMap mp) {
		if(userService.validateUser(user)) {
			
		
			mp.addAttribute("username",user.getUsername());
			return "welcome";
		}
		else
		{
			mp.addAttribute("LogonError","Check your credentials");
			return "login";
		}
	}

}
