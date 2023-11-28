package com.example.Logger2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Logger2.controller.WelcomeController;

public class welcomeservice {

private static Logger logger=LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/welcomeservice1")
	public String welcomeservice1() {
		
		String msg="this is the starting point";
		logger.info("this is INFO logging"+msg);
		
		String msg1="this is the ending point";
		
		logger.info("this is INFO logging"+msg1);
		
		return "welcome to bikkadit";
		
		
		
		
	}
}
