package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      ApplicationContext ctx =SpringApplication.run(SpringBootMain.class);
	System.out.println("Running Sucessfully");
	SpringConcatenation concat=(SpringConcatenation)ctx.getBean(SpringConcatenation.class);
	System.out.println("Concatenated string is:  "+concat.concatenate("Hi Everyone ","Welcome to spring Boot Application"));
	}

}
