Feature:  Object creation

Scenario: Account record creation

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




Scenario: Lead record creation

Given User launch the chrome browser
When user opens the url "https://login.salesforce.com"
When user enters the username as "prachi.bhosale@merkle.com.nippondev" and password as "Prachi@123"
And user click on the login button
Then user navigates to the salesforce home page
And on the home page user clicks on the "AppLauncher"
And search for the "Leads" object
And now user will select the "Leads" object from the list
Then user will navigate to the leads page
When user click on "New" button
Then new window will open and select the radiobutton 
And user will click on "Next" button
And enter the value in lastname field as "New Lead"
And user need click on "Save" button