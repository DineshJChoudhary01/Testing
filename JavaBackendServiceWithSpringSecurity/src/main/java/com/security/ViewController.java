package com.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
//@RequestMapping("/")
@RequestMapping(value="/")
public class ViewController {

	@GetMapping(value="/login")
	public String login() {
		System.out.println("authenticated successfully");
		return "successfully";
	}
	@PostMapping(value="/test")
	public String test() {
		System.out.println("tested successfully");
		return "dashboard";
	}
}
