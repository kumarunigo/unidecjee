package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class UnijeeApplication {

	public static void main(String[] args) {
		ArrayList<String> student;
		
		System.out.println("in java program");
		SpringApplication.run(UnijeeApplication.class, args);
	}

}
