package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
This is the main application class. It has a main method and is also the Spring configuration.

 @see <a href="http://projects.spring.io/spring-boot/">Spring Boot</a>
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
