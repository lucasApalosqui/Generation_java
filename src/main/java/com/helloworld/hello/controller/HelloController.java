package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "Utilizei de persistencia e orientação a detalhes";
	}
	
	@GetMapping("/hello2")
	public String hello2() {
		return "meu objetivo de aprendizagem é me especializar mais em spring"; 
	}
}
