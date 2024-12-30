package stepDefinitions;



import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.AccountPage;
import pageObjects.LeadPage;
import pageObjects.LoginPage; 

public class BaseClass 
{

	public WebDriver driver;
	public LoginPage loginPage;
	public AccountPage accountPage;
	public LeadPage leadPage;
	public Logger log;
	public Properties configProp;
	
	
	

}
