Feature:  Account record creation

Scenario:

Given User launch the chrome browser
When user opens the url "https://login.salesforce.com"
When user enters the username as "prachi.bhosale@merkle.com.nippondev" and password as "Prachi@123"
And user click on the login button
Then user navigates to the salesforce home page
And on the home user clicks on "AppLauncher"
And search for the "Accounts" 
And select the "Accounts"
Then user will navigate to the Accounts page
When user clicks on "New" button
Then New window will open and now select the radio button 
And click on "Next" button
And add the value in lastname as "New Account"
And click on save button 
