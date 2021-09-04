Feature: login functionality

Scenario Outline: entering valid username and password

Given I load the "https://opensource-demo.orangehrmlive.com/"
Then I enter <username> into the username field
And I enter <password> into the password field
Then I click the login button

Examples: 
|username|password|
|admin|pswd123|
|admin1|pswd456|
|Admin|admin123|
