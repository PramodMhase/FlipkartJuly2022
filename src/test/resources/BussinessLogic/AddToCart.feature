Feature: Add to Cart Fuctionality

Background: User login Successfully
Given user open browser with "Chrome" exe
Given user enter url as
Given user click on initial login page
Given user navigate on login button
Given user click on Login button
Given user enter valid Username as "mhasepramod44@gmail.com"
Given user enter valid Password as "Pramod@250587"
Given user click on final Login button


Scenario: add items into cart
When User Navigate to Electronics tab
When User click on OPPO link under mobile
When User click on Required OPPO mobile link
When user Switch to new open tab for OPPO
When User Click on Add To Cart


Scenario: check items added in cart for validation
When User click on Cart link
Then User Validate item added in Cart