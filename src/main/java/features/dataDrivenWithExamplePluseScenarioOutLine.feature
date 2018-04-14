Feature: Add Referral feature

Scenario Outline: Add Referral test scenario
 	Given threeadmin is on login page
    When threeverify the URL
    Then threeenter "<username>" and "<password>" 
    Then threeclick on login button
    Then threeverify the home page
    Then click on add new referral link
    Then enter referral details "<fName>" and "<lName>" and "<email>" and "<telephone>"
    Then click on submit referral button
    Then close the browser
 		
 		Examples:
 		| username | password     | fName    | lName   | email        | telephone  | 
 		| admin    | Wedriveon16! | ref      |  one    | one@test.com | 9595455315 |
 		| admin    | Wedriveon16! | ref      |  two    | two@test.com | 9762115012 |
 		 
	