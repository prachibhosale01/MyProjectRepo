package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WaitHelper;

public class LeadPage 
{
	public WebDriver driver;
	WaitHelper waithelper;
	
	public LeadPage(WebDriver driver) 
    {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        waithelper = new WaitHelper(this.driver);
    }
	
	By appLauncher = By.xpath("//button[@title='App Launcher']");
	By searchLead = By.xpath("//input[@type='search' and @role='combobox']");
	By selectLead = By.xpath("//a[@id='Lead']//b[contains(text(),'Leads')]");
	By newLead = By.xpath("//button[@name='New' and text()='New']");
	By nextButton = By.xpath("//span[text()='Next']");
	By lastName = By.xpath("//input[@class='slds-input' and @name='lastName']");
	By saveButton = By.xpath("//button[text()='Save']");
	
	
	public void clickOnApplauncher() throws InterruptedException
	{
		
	driver.findElement(appLauncher).click();
	Thread.sleep(2000);
	}
	
	public void searchForLead	() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(searchLead).sendKeys("Leads");
	Thread.sleep(2000);
	}
	
	public void selectForLead() throws InterruptedException
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(selectLead).click();
	Thread.sleep(2000);
	}
	
	public void newLeadButton() throws InterruptedException
	{
	driver.findElement(newLead).click();
	Thread.sleep(2000);
	}
	
	public void selectNext() throws InterruptedException
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(nextButton).click();
	
	}
	
	public void addLastName()
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(lastName).sendKeys("New Lead");
	}
	
	public void clickOnSave()
	{
	driver.findElement(saveButton).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
