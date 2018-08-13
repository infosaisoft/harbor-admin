package com.harbor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String showHomePage() {
		return "home";
	}
	
	@RequestMapping(value="/docAdmin", method=RequestMethod.GET)
	public String docAdmin() {
		return "docadmin";
	}
	
	@RequestMapping(value="/patientAdmin", method=RequestMethod.GET)
	public String patientAdmin() {
		return "patientAdmin";
	}
	
	
	@RequestMapping(value="/hospitalAdmin", method=RequestMethod.GET)
	public String hospitalAdmin() {
		return "hospitalAdmin";
	}
}
