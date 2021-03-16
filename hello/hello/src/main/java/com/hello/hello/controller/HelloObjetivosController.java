package com.hello.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloobjetivos")
public class HelloObjetivosController {
	@GetMapping
	public String helloobjetivos() {
		return "Hello world! \nSpring boot e Java!";
	}

}
