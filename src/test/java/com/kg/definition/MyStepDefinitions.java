package com.kg.definition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import javax.management.RuntimeErrorException;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given ("^I am at Gmail login page$")
	public void given()
		{
		System.out.println("Given");
		}
	@When ("^I fill in username as '(.+)'$")
	public void when(String username) throws Throwable
	{
		// System.out.println("When "+username);
		// throw new PendingException();
		
		if(username.length()==0)
		{
			throw new PendingException ("string is empty");
		}
		else
		{
			System.out.println("When "+username);
	   }	

	}
	@Then ("^I fill in password as '(.+)'$")
	public void and(String password)
	{
		System.out.println("Then "+password);
		
	}

}