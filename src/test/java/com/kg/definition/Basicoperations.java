package com.kg.definition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import static org.junit.Assert.assertEquals;
import com.kg.study.calc;
import org.junit.experimental.theories.internal.ParameterizedAssertionError;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Basicoperations {
    int number1,number2;
    calc c=new calc();
    @Given("^print number1 as '(.+)'$")
    public void i_fill_in_number1_as_(int no1)  {
        number1=no1; 
    }
    @Given("^enter number1 as '(.+)'$")
    public void enter_number1_as_(int no1)  {
        number1=no1;  
    }

    @When("^i sum$")
    public void i_sum_(){
       try
       { 
        int actual=c.sum(number1,number2);
        System.out.println("actual"+actual);
        // assertEquals(number1+number2,actual);
        }
      catch(NumberFormatException e)
      {
          System.out.println("Incompatiable");
      }
      catch(OutOfMemoryError e2)
      {
          System.out.println("Out of range");
      }
      catch(IllegalArgumentException e1)
      {
          System.out.println("argument missing");
      }
      catch(Exception e)
      {
          System.out.println("Paramter Missing");
      }
    }

    @When("^i multiply$")
    public void i_multiply_(){
        int actual=c.mul(number1,number2);
        System.out.println("actual"+actual);
        assertEquals(number1*number2,actual);  
    }

    @Then("^it should display output$")
    public void it_should_display_the_results()  {  
    }

    @And("^print number2 as '(.+)'$")
    public void i_fill_in_number2_as_(int no2)  {
        number2=no2; 
    }

    @And("^enter number2 as '(.+)'$")
    public void enter_number2_as_(int no2)  {
        number2=no2;
    }
}