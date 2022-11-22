package com.test.firstspringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstSpringDemoApplication {

	@GetMapping(/message)
	public String message(){
		return "Hi Srimurugan, congrats";

	}

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringDemoApplication.class, args);
	}

}
