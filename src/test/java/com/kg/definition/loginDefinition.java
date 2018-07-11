package com.kg.definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class loginDefinition {

    @Given("^I am at  login page$")
    public void i_am_at_login_page() throws Throwable {
        throw new PendingException();
    }

    @When("^I fill in username as '(.+)'$")
    public void i_fill_in_username_as_(String username) throws Throwable {
        throw new PendingException();
    }

    @Then("^I fill in password as '(.+)'$")
    public void i_fill_in_password_as_(String password) throws Throwable {
        throw new PendingException();
    }

}