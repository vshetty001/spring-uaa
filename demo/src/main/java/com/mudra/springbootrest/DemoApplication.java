package com.mudra.springbootrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		System.out.println("=== starting app === ");
		SpringApplication.run(DemoApplication.class, args);
	}

}
