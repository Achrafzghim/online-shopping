package net.ach.onlineshoppingv1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	

		
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Hello");
				
		//passing the list of categories
		return mv;				
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","About Us");
		return mv;				
	}	
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Contact Us");
		return mv;				
	}	
	
	
	/*
	 * Methods to load all the products and based on category
	 * */
	
	
	/*
	 * Viewing a single product
	 * */
	
	

	
	


}
