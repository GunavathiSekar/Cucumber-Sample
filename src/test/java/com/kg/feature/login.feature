Feature: Login Functionality 

Scenario Outline:: Test the  login page
Given I am at  login page
When I fill in username as '<username>'
Then I fill in password as '<password>'

Examples:
| username 	| password 	|
| lava19 	| lava2015	|
| thanu15	| Thanu-15  |
