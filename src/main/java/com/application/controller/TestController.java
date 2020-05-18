package com.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/t1")
	public String test1(String name) {
		System.out.println("test1");
		return "test1: " + name;
	}

}
