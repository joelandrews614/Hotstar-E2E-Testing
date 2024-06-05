Feature: Home Page Functionality of Hotstar

	Background:
		Given user is on Homepage

	@ignore
  Scenario: Validating the Navbar Icons	
    Given user can see the Navbar Icons 
    
  Scenario: Validating the MySpace Page
  	Given user can see the my space link
  	When user clicks on the my space link
  	Then user should see the login button
  	
  