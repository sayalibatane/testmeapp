Feature: Sign-in
	Sign-in should be quick and friendly
@parameter
Scenario Outline: user login with multiple data
	Given user is on the TestmeApplogin page
	When user enters the username "<username>"
	And user enters the password "<password>"
	Then user can do successful login
	Examples:
	|username|password|
	|Lalitha|Password123|