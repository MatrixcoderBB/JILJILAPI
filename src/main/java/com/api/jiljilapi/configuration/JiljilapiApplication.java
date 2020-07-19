package com.api.jiljilapi.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = { "com.api.jiljilapi.configuration","com.api.jiljilapi.controller"})
@SpringBootApplication
public class JiljilapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JiljilapiApplication.class, args);
		System.out.println("Inside main method");
	}
}
