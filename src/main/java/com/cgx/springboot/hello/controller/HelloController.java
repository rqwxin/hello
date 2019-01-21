package com.cgx.springboot.hello.controller;

import com.cgx.springboot.hello.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@RequestMapping(path="/hello2",method=RequestMethod.GET)
	public String hello(){
		String msg = helloService.saySomething( "hello spring-boot");
		return msg;
	}
}
