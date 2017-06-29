package com.hostal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hostal.model.User;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin(ModelMap map, User user){
		System.out.println("inside login controller");
		
		map.addAttribute(user);
		
		return "login";
	}
}
