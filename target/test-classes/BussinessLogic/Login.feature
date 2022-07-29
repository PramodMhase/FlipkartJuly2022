Feature: Login Fuctionality

Background: Application opens Successfully
Given user open browser with "Chrome" exe
Given user enter url as

@SmokeTest
Scenario Outline: Login functionality with valid credentials
When user click on initial login page
When user navigate on login button
When user click on Login button
When user enter valid Username as <username>
When user enter valid Password as <password>
When user click on final Login button
Then application shows user login successfully

Examples:
				|username|password|
				|mhasepramod44@gmail.com|Pramod@250587|