package com.home.mycafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers
{
	@RequestMapping("/welcome")
	public String WelcomePage(Model model)
	{
		/*
		 * String name = "Pratiksha"; model.addAttribute("valuename", name);
		 * model.addAttribute("sitename", "MOM's Cafe");
		 */
		
		return "Welcome-Page";
	}
	
	
	@RequestMapping("/placeorder")
	public String orderpage(HttpServletRequest request , Model model)
	{
		//handle the data recieved from the user
		String usserEntervalue = request.getParameter("name");
		
		//adding the capture value to the madel
		model.addAttribute("ordername", usserEntervalue);
		
		
		//set the user data with the model object and send it to views
		return "place-order";
		
	}

}
