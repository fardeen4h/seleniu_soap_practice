Feature: Application Login

Scenario: Home page default login
Given user is on netbanking login page
When user logs into applivation with user "Jin" and password "1234"
Then Home page is populated
And cards are displayed "true"

Scenario: Home page default login
Given user is on netbanking login page
When user logs into applivation with user "john" and password "4567"
Then Home page is populated
And cards are displayed "false"