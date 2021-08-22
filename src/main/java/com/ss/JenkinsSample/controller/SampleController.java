package com.ss.JenkinsSample.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@RequestMapping
	public String hello() {
		Random rand = new Random();
		return "Hello from Berkley Nilles  with a single random number : " + rand.nextInt()  ;
	}

}
