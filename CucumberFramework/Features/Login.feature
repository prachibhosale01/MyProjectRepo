Feature: Login Functionality
 
Scenario:
 
Given User launch the chrome browser
When user opens the url "https://login.salesforce.com"
When user enters the username as "prachi.bhosale@merkle.com.nippondev" and password as "Prachi@123"
And user click on the login button
Then user navigates to the salesforce home page

Scenario Outline: Login with different users

Given User launch the chrome browser
When user opens the url "https://login.salesforce.com"
When user enters the username as "<username>" and password as "<password>"
And user click on the login button
Then user navigates to the salesforce home page


Examples:
| username | password |
| prachi.bhosale@merkle.com.nippondev | Prachi@123|
| prachi.bhosale@merkle.com.nippondev1 | Prachi@1234 |