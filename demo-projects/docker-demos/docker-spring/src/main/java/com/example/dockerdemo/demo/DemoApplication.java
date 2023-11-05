package com.example.dockerdemo.demo;

import org.springframework.boot.SpringApplication;
import static org.springframework.boot.SpringApplication.run;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String m1(){
		return "<h1>Hello World</h1>";
	}

}
