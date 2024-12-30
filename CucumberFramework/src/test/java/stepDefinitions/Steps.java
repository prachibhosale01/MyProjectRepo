package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountPage;
import pageObjects.LoginPage;


public class Steps extends BaseClass
{

			
			
			AccountPage accountPage = new AccountPage(driver);
			
			

			@Given("User launch the chrome browser")
			public void user_launch_the_chrome_browser() 
			{
			   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
			   driver=new ChromeDriver();
			   loginPage=new LoginPage(driver);
			   accountPage=new AccountPage(driver);
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





		}

		
		
		
		
		



