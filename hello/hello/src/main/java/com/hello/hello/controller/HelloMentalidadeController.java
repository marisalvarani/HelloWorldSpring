package com.hello.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellomentalidade")
public class HelloMentalidadeController {
	
	@GetMapping
	public String hellomentalidade() {
		return "Hello world! \nMentalidade de crescimento, persistência e atenção aos detalhes!";
	}

}
