package com.crudexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {


	@RequestMapping("/old")
	public String developer(Model model) {
        return "home";
	}
	
	
	@RequestMapping("/")
	public String getNewHome(Model model) {
        return "content";
	}
	
	
	


}
