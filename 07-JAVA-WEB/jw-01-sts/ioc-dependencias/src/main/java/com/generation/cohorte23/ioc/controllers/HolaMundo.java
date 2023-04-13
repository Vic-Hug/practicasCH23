package com.generation.cohorte23.ioc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
	@RequestMapping("/hola")
	public String hola() {
		return "Hola mundo desde Spring Boot";
	}
}
