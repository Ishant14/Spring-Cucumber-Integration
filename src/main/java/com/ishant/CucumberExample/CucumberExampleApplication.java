package com.ishant.CucumberExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ishant.CucumberExample.service.Calculation;

@SpringBootApplication
public class CucumberExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(CucumberExampleApplication.class, args);
		Calculation cal = ctx.getBean(Calculation.class);
		int sum = cal.sum(5, 3);
		System.out.println("Sum: "+sum);;
	}
}
