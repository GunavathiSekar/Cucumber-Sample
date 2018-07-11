@calc
Feature: Sum Test
@sum
Scenario Outline:: Test the Gmail login
Given print number1 as '<no1>'
And print number2 as '<no2>'
When i sum '<expected>'
Then it should display output

Examples:
| no1 	| no2	| expected|
| 12.0	| 13	| 25      |
| 14	| 16	| 30      |

@multiply
Scenario Outline:: Multiply Test 
Given enter number1 as '<no1>'
And enter number2 as '<no2>'
When i multiply '<expected>'
Then display the results

Examples:
| no1 	| no2	| expected|
| 12	| 13	| 156     |
| 14	| 16	| 224     |