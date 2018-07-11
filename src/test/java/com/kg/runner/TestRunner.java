package com.kg.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="..\\study\\src\\test\\java\\com\\kg\\feature",
//giving the path where feature file exists.
glue = "com.kg.definition", dryRun = false, strict = true,
tags = {"@ui"}, //if you want to run calc1.feature tag is @calc1 if you want to run calc.feature tag is @calc 
plugin = { "pretty", "html:target/html", "json:target/cucumber.json" })   //Feature file will be converted by json in cucumber.json automatically by cucumber.
public class TestRunner
{

}