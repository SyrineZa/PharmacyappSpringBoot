package com.spring.pharmacyApp;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication

public class PharmacyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmacyAppApplication.class, args);
	}
    
}
