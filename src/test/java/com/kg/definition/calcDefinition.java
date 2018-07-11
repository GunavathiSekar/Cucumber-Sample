package com.kg.definition;
import static org.junit.Assert.assertEquals;

import com.kg.study.Calculator;

import org.junit.runner.RunWith;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class calcDefinition{
@Given("^enter first numbers$")
public void enter_first_numbers()  {
    System.out.println("given");
}

@Given("^enter the first numbers$")
public void enter_the_first_numbers()  {
    System.out.println("");
}

@When("^i create object$")
public void i_create_object()  {
    System.out.println("");
}

@When("^i create the object$")
public void i_create_the_object()  {
    System.out.println("");
}

@Then("^sum will be displayed$")
public void sum_will_be_displayed()  {
    System.out.println("");
}

@Then("^displays the output$")
public void displays_the_output()  {
    System.out.println("");
}

@And("^enter  second numbers$")
public void enter_second_numbers()  {
    System.out.println("");
}

@And("^enter the second numbers$")
public void enter_the_second_numbers()  {
    System.out.println("");
}
}
