@ui
Feature: Gmail Login Test
@fruit
Scenario Outline:: Test the Gmail login
Given I am at Gmail login page
When I fill in username as '<username>'
Then I fill in password as '<password>'

Examples:
| username 	| password 	|
| Mango 	| Yellow 	|
| Orange 	|        	|
|        	| Red 		|