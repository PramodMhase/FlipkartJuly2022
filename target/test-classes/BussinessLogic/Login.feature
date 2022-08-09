Feature: Login Fuctionality

Background: Application opens Successfully
Given user open browser with "Chrome" exe
Given user enter url as

@SmokeTest
Scenario: Login functionality with valid credentials
When user click on initial login page
When user navigate on login button
When user click on Login button
When user enter valid Username as "mhasepramod44@gmail.com"
When user enter valid Password as "Pramod@250587"
When user click on final Login button
When user take Screenshot of webpage
Then application shows user login successfully