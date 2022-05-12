package com.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoreController {
	
	@RequestMapping("/")
	public String welcome() {
		return "welcome.jsp";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login.jsp";
	}
	
	@RequestMapping("/next")
	public String next() {
		return "page2.jsp";
	}
	
	@RequestMapping("/loggedout")
	public String logout() {
		return "logout.jsp";
	}
}
