package com.example.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	Logger logger = LoggerFactory.getLogger(MessageController.class);
	
	@GetMapping("/message")
	public String getmessage() {
		
		logger.info("[getmessage] info message");
		logger.warn("[getmessage] warn message");
		logger.error("[getmessage] error message");
		logger.debug("[getmessage] debug message");
		logger.trace("[getmessage] trace message");
		
		
		
		
		return "check message";
		
	}
	
}
