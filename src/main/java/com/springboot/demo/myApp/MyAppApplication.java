package com.springboot.demo.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		//default username : user
		SpringApplication.run(MyAppApplication.class, args);
	}

}
