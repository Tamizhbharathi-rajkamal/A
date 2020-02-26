Feature: To validate Login Functionality

Background:
	Given User has to be in facebook login page

Scenario Outline: To verify username and password with invalid credentials
	#Given User has to be in facebook lobin page
	When User enters invalid "<username>" and invalid "<password>" 
	And User click Login button
	Then User has to naviagte to login attempt page
	
	Examples: 
						|username|password|
						|tamizh|12345|
						|bharathi|67890|
	
	
Scenario: To verify facebook signup
	#Given User has to be in facebook login page
	When User enters firstname and surname
	|tamizhdatatable|24680|
	|sahashra|33333|
	Then User able to Sign up
	
	
	
Scenario: To verify forgot password
	#Given User has to be in facebook login page
	When User click forgotten account 
	Then User navigate to password recover page