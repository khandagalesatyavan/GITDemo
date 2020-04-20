Feature: Application Login

Scenario: Home Page Difault Login
Given User is On Netbankinng Loading Page
When User login into Application page with "Satish" and Password "Satish@1988"
Then Homepage is Papulated
And Card Displayed are "true"



Scenario: Home Page Difault Login
Given User is On Netbankinng Loading Page
When User login into Application page with "rohit" and Password "Rohit@123"
Then Homepage is Papulated
And  Card Displayed are "false"


