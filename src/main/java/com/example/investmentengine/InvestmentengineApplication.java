package com.example.investmentengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class InvestmentengineApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentengineApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

}
