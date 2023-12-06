package com.DineshIt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcomeMethod() {
		
		return "Welcome to Hyderabad";	
	}

}
