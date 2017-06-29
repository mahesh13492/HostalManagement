package com.hotel.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.models.Login;
import com.loginservices.LoginServices;

@Controller
public class HotelLoginController {

	//@Autowired
    //private LoginServices loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap map, HttpSession seHttpSession) {
		// seHttpSession.invalidate();
		System.out.println("login  controller");
		Login login = new Login();
		map.put("Login", login);
		return "login";
	}
	
	
	@RequestMapping(value = "/deshboard", method = RequestMethod.GET)
	public String welcomeUser(ModelMap map, HttpSession seHttpSession) {
		// seHttpSession.invalidate();
		System.out.println("login welcome user controller");
		Login login = new Login();
		map.put("Login", login);
		return "deshboard";
	}

/*	@RequestMapping(value = "/loginSubmmit", method = RequestMethod.POST)
	public String loginSubmmit(@ModelAttribute("Login") Login login, BindingResult result) {

		login=loginService.findByUserNameAndEmailId(login);
        if(login!=null)
        	return "redirect:/dashboard.do";
        else
		return "login";
	}
*/
}
