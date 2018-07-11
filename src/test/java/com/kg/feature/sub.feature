@calcoperations
Feature: Sum Test
@sum
Scenario Outline:: Test the Gmail login
Given print number1 as '<no1>'
And print number2 as '<no2>'
When i sum 
Then it should display output

Examples:
| no1 	          | no2	| 
| 12888888888888.000331	| 13	| 
| 14	    |   	|

@multiply
Scenario Outline:: Multiply Test 
Given enter number1 as '<no1>'
And enter number2 as '<no2>'
When i multiply 
Then display the results

Examples:
| no1 	| no2	| 
| 12	| 13	|
| 14	| 16	| 