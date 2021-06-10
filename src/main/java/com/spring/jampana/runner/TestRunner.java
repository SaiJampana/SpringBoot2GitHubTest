package com.spring.jampana.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		String name= "Jampana";
		System.out.println("WELCOME TO SPRING BOOT _ GITHUB TEST committed by "+ name );

	}

}
