package com.springDesignPattern.chapter10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springDesignPattern.chapter10.controller.model.DemoModel;

@RestController
public class DemoController {

	
	public DemoController() {
		// TODO Auto-generated constructor stub
	}


	@GetMapping("/method1")
	public DemoModel method1() {
	DemoModel model= new DemoModel(1,"test");
	return model;
		
		
	}

	@GetMapping("/")
	public DemoModel defaultMethod() {
	DemoModel model= new DemoModel(1,"Application is up and running");
	return model;
		
		
	}

}
