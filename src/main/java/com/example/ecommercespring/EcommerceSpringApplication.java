package com.example.ecommercespring;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceSpringApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure().load(); // Load environment variables from .env file

		dotenv.entries().forEach( entry -> System.setProperty(entry.getKey(), entry.getValue())); // Set each environment variable as a system property

	SpringApplication.run(EcommerceSpringApplication.class, args);
	}

}
