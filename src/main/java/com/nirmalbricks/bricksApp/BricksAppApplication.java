package com.nirmalbricks.bricksApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.nirmalbricks.bricksApp.controller","com.nirmalbricks.bricksApp.model","com.nirmalbricks.bricksApp.service","com.nirmalbricks.bricksApp.repo"})
public class BricksAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BricksAppApplication.class, args);
	}

}
