package com.vv.lambdaSyntax;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaSyntaxApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaSyntaxApplication.class, args);
	}

	@PostConstruct
	public void init() {
		// Code to execute at startup
		System.out.println(new Converter().doConversion(  ( var a, var b) -> a.repeat( b ) ) );
	}
}
