Feature: TwoDrievOn Login Feature

Scenario: TwoDriveOn Login Test scenario  
    Given twoadmin is on login page
    When twoverify the URL
    Then twoenter "admin" and "Wedriveon16!" 
    Then twoclick on login button
    Then twoverify the home page
	