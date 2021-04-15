package net.techtter.demo.student.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Home {
	
	@GetMapping("/")
	String index() {
		return "redirect:/swagger-ui.html";		
	}
}
