package com.ishant.CucumberExample.service;

import org.springframework.stereotype.Service;

@Service
public class Calculation {

	public int sum(int a , int b){
		return a+b;
	}
	
}
