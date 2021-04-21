package com.example.onlineTeaching.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@RequestMapping("/test")
	@ResponseBody
	public String name()
	{
		return "hi every welcom body ";
	}
	
	
	
	@GetMapping("/welcom")
	@ResponseBody
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	//return String.format("Hello %s!", name);
		return "Hello"+" "+name+"!";
	}
	
}
