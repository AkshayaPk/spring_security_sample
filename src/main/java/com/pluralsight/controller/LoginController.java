package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(ModelMap modelMap)
	{
		System.out.println("In the login method");
		return "login";
	}
	
	@RequestMapping(value="/loginFailed" , method=RequestMethod.GET)
	public String loginFailed(ModelMap modelMap)
	{
		System.out.println("Login Failed");
		modelMap.addAttribute("error","true");
		return "login";
	}
	
	@RequestMapping(value="/logout" , method=RequestMethod.GET)
	public String logout(ModelMap modelMap)
	{
		return "logout";
	}
	
	@RequestMapping(value="/403" ,method=RequestMethod.GET)
	public String error403(ModelMap modelMap)
	{
		return "403";
	}
	
	@RequestMapping(value="/405" ,method=RequestMethod.POST)
	public String error405(ModelMap modelMap)
	{
		return "405";
	}
}
