package com.kg.definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import static org.junit.Assert.assertEquals;

import com.kg.study.Calculator;
import com.kg.study.calc;

import java.*;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class sumDefinition {
    long number1,number2;

    @Given("^I fill in number1 as '(.+)'$")
    public void i_fill_in_number1_as_(long no1)  {
        this.number1=no1;
       
    }
    @When("^i add '(.+)'$")
    public void i_add_(long expected)  {
        calc c=new calc();
       // long actual=c.sum(number1,number2);
        //System.out.println(assertEquals(expected,actual)); 
    }
    private Object assertEquals(long expected, long actual) {
		return null;
	}

	@Then("^it should display the results$")
    public void it_should_display_the_results()  {
    }

    @And("^I fill in number2 as '(.+)'$")
    public void i_fill_in_number2_as_(long no2)  {
        this.number2=no2;
       
    }

}