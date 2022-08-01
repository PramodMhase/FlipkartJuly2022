Feature: Manage Adresses Fuctionality

Background: Application opens Successfully
Given user open browser with "Chrome" exe
Given user enter url as
Given user click on initial login page
Given user navigate on login button
Given user click on Login button
Given user enter valid Username as "mhasepramod44@gmail.com"
Given user enter valid Password as "Pramod@250587"
Given user click on final Login button



Scenario: Manage Adresses functionality with Adress details
When User click on Manage Addresses tab
When User Click on ADD A NEW ADDRESS
When User enter name as "PRAMOD MHASE"
When User enter ten digit mobile number as "7722087357"
When User enter pin code as "413737"
When User enter Locality as "Gaothan"
When User enter address as "Ap-MAMADAPUR"
When User enter Landmark as "Tambewadi Road"
When User enter Alternate phone as "9370855400"
When User Click on Adress type radio button Home
When User Click on save button
Then application shows user address updated successfully