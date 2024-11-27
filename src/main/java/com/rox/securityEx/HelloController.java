package com.rox.securityEx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String greet(HttpServletRequest request) {
		return "Welcom to rox" + " " + request.getSession().getId(); 	
	}

}
