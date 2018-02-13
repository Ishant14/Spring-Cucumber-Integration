package com.ishant.CucumberExample;

import org.junit.Assert;
import org.junit.runner.RunWith;
import com.ishant.CucumberExample.service.Calculation;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources")
public class CucumberExampleApplicationTests {

	int result;
	
	@When("^I have two number as '(\\d+)' and '(\\d+)' and call the sum method$")
	public void i_have_two_number_as_and_and_call_the_sum_method(int firstNum, int secondNum) throws Throwable {
	    Calculation cal = new Calculation();
		result = cal.sum(firstNum, secondNum);
	}
	
	@Then("^I recieve final result as '(\\d+)'$")
	public void i_recieve_final_result_as(int finalResult) throws Throwable {
	   Assert.assertEquals(finalResult, result);
	}
	

}
