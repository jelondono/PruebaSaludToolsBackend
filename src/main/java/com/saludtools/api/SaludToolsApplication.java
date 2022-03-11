package com.saludtools.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SaludToolsApplication {
	public static void main(String[] args) {
		SpringApplication.run(SaludToolsApplication.class, args);
	}

}
