Feature: OrangeHRM Login

	Scenario: Logo presence on OrangeHRM home page
		Given I launch chrome browser
		When I open OrangeHRM homepage 
		Then I verify that the logo present on page
		And Close browser