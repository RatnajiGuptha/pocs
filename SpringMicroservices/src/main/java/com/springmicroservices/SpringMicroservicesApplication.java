package com.springmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesApplication.class, args);
		System.out.println("Server is running at localhost:8088");
	}

}
