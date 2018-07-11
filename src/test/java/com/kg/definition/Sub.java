package com.kg.definition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Sub {

    @Given("^Get number1 as '(.+)'$")
    public void get_number1_as_(int no1)  {
        
    }
    @When("^i sub '(\\d+)'\\-'(\\d+)'$")
    // @When("^i sub '(.+)'-'(.+)'$")
    public void i_sub_(int no1, int no2)  {
        System.out.println("number one"+no1);
        System.out.println("number two"+no2);
        System.out.println("result "+(no1-no2));
    }

    @Then("^display results$")
    public void display_results()  {
        
    }

    @And("^Get number2 as '(.+)'$")
    public void get_number2_as_(int no2)  {
        
    }


}
