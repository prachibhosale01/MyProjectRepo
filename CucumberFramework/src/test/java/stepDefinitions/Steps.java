package stepDefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountPage;
import pageObjects.LeadPage;
import pageObjects.LoginPage;


public class Steps extends BaseClass
{

	AccountPage accountPage = new AccountPage(driver);
	LeadPage leadPage = new LeadPage(driver);
	
			@Given("User launch the chrome browser")
			public void user_launch_the_chrome_browser() 
			{
				  
				 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
				   driver=new ChromeDriver();
				   loginPage=new LoginPage(driver);
				   accountPage=new AccountPage(driver);
				   leadPage= new LeadPage(driver);
			   
			}

			@When("user opens the url {string}")
			public void user_opens_the_url(String url) 
			{
				
			    driver.get(url);
			   driver.manage().window().maximize();
			}

			@And("user enters the username as {string} and password as {string}")
			public void user_enters_the_username_as_and_password_as(String username, String password) 
			{
				
				loginPage.setUsername(username);
				loginPage.setPassword(password);
			}

			@And("user click on the login button")
			public void user_click_on_the_login_button() 
			{
				
				loginPage.clickLogin();
			}

			@Then("user navigates to the salesforce home page")
			public void user_navigates_to_the_salesforce_home_page() 
			{
				 
			}
//---------------------------------Account Creation-----------------------			
			@Then("on the home user clicks on {string}")
			public void on_the_home_user_clicks_on(String string) throws InterruptedException 
			{
				accountPage.clickOnApplauncher();
			}

			@Then("search for the {string}")
			public void search_for_the(String string) throws InterruptedException 
			{
				accountPage.searchForAccount();
			}

			@Then("select the {string}")
			public void select_the(String string) throws InterruptedException
			{
				accountPage.selectForAccount();
				
			}

			@Then("user will navigate to the Accounts page")
			public void user_will_navigate_to_the_accounts_page() 
			{
			  
			}
			
			@When("user clicks on {string} button")
			public void user_clicks_on_button(String string) throws InterruptedException 
			{
				accountPage.selectNewButton();
			}

			@Then("New window will open and now select the radio button")
			public void new_window_will_open_and_now_select_the_radio_button() 
			{
				
			}

			@Then("click on {string} button")
			public void click_on_button(String string) throws InterruptedException 
			{
				accountPage.next();
			}
			
			@Then("add the value in lastname as {string}")
			public void add_the_value_in_lastname_as(String string) 
			{
				accountPage.setLastName();
			}

			@Then("click on save button")
			public void click_on_save_button() 
			{
				accountPage.clickOnSave();
			}
//------------------Lead Creation-------------------------------------------------------------------
			@Then("on the home page user clicks on the {string}")
			public void on_the_home_page_user_clicks_on_the(String string) throws InterruptedException 
			{
			  leadPage.clickOnApplauncher();
			}

			@Then("search for the {string} object")
			public void search_for_the_object(String string) throws InterruptedException 
			{
			    leadPage.searchForLead();
			}

			@Then("now user will select the {string} object from the list")
			public void now_user_will_select_the_object_from_the_list(String string) throws InterruptedException 
			{
				leadPage.selectForLead();
			}

			@Then("user will navigate to the leads page")
			public void user_will_navigate_to_the_leads_page()
			{
			 
			}

			@When("user click on {string} button")
			public void user_click_on_button(String string) throws InterruptedException 
			{
				leadPage.newLeadButton();
			}

			@Then("new window will open and select the radiobutton")
			public void new_window_will_open_and_select_the_radiobutton() 
			{
			 
			}

			@Then("user will click on {string} button")
			public void user_will_click_on_button(String string) throws InterruptedException 
			{
				leadPage.selectNext();
			}

			@Then("enter the value in lastname field as {string}")
			public void enter_the_value_in_lastname_field_as(String string) 
			{
			   leadPage.addLastName();
			}

		

			@Then("user need click on {string} button")
			public void user_need_click_on_button(String string)
			{
				leadPage.clickOnSave();
			}



			



		}

		
		
		
		
		



