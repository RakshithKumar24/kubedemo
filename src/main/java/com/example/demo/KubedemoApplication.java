package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubedemoApplication.class, args);
	}
	
	public String getHello() {
		return "Hey buddy..!hw rrr u?";
	}

}
