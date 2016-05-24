package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CdliveApplication {

	@RequestMapping (method = RequestMethod.GET, value = "/hi")
	public String hi () {
		return "Hi";
	}

	public static void main(String[] args) {
		SpringApplication.run(CdliveApplication.class, args);
	}
}
