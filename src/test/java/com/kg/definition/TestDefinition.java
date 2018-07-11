package com.kg.definition;

import java.util.List;

import com.kg.study.calc;

import org.junit.runner.RunWith;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class TestDefinition {
    calc c=new calc();
    @Given("^I am at GMail login page$")
    public void given() {
        System.out.println("Given");
    }
    @When("^I open GMail login$")
    public void open(DataTable table) {
          try
        {    
        List<List<String>> data = table.raw();
        System.out.println("Total Rows " + data.size());
        for (int i = 1; i <= data.size() - 1; i++) {
            int no1=Integer.parseInt(data.get(i).get(0));
            int no2=Integer.parseInt(data.get(i).get(1));
            int actual=c.sum(no1, no2);
            System.out.println(actual);
          }    
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
}