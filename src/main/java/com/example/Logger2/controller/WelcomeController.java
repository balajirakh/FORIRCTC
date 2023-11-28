package com.example.Logger2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	private static Logger logger=LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/welcome")
	public String welcome() {
		logger.trace("this is TRACE Logging");
		logger.warn("this is WARN logging");
		logger.debug("this is WARN logging");
		logger.error("this is WARN logging");
		logger.info("this is WARN logging");
		
		
		return "welcome to bikkadit";
		
		
		
		
	}
	
	@GetMapping("/welcomeservice1")
	public String welcomeservice1() {
		
		String msg="this is the starting point";
		logger.info("this is INFO logging"+msg);
		
		String msg1="this is the ending point";
		
		logger.info("this is INFO logging"+msg1);
		
		return "welcome to bikkadit";
		
		
		
		
	}

}
