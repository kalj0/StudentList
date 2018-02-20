package com.nenad.student_list.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class TestController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String testMethod() {
		return "testxx";
	}
	
	
	
}
