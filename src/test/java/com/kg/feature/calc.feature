@Calculator
Feature: Calculator
As a user
I want to check basic operations
so that i can get the result for manipulation
    @Add
    Scenario: Add two numbers
        Given enter first numbers
        And enter  second numbers
        When i create object
        Then sum will be displayed
    @Multiply
    Scenario: Multiply two numbers
        Given enter the first numbers
        And enter the second numbers
        When i create the object
        Then displays the output
