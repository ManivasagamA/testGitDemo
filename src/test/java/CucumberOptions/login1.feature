	Feature: QA ClickAcademy Application Login
	Scenario Outline: Login
	Given Initialise the browser with chrome
	And Navigate to "http://www.qaclickacademy.com/" site
	And Click on Login button in home page and navigate to SSO page
	When User logs in with id <username> and pwd <password>
	Then Verify user logged in successfully
	
	Examples:
	|username	|password	|
	|mani		|password	|
	|vasagam	|password1	|
	
