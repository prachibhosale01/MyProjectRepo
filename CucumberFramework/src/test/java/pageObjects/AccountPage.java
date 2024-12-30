package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class AccountPage 
{

	public WebDriver driver;
	private WebDriverWait wait;
	
	
	
	
	public AccountPage(WebDriver driver) {
        this.driver = driver;
        // Initialize WebDriverWait with Duration
       
        PageFactory.initElements(driver, this);
    }
	
	By appLauncher = By.xpath("//button[@title='App Launcher']");
	By searchAccount = By.xpath("//input[@type='search' and @role='combobox']");
	By selectAccount= By.xpath("//a[@id='Account']//b[contains(text(),'Accounts')]");
	By newAccount = By.xpath("//button[@name='New']");
	By accountRecordType = By.xpath("//span[text()='Accounts']");
	By nextButton = By.xpath("//span[text()='Next']");
	By lastName = By.xpath("//input[@class='slds-input' and @name='Name']");
	By saveButton = By.xpath("//button[text()='Save']");
	
			
	
	public void clickOnApplauncher() throws InterruptedException
    {
		driver.findElement(appLauncher).click();
		Thread.sleep(2000);
		
    }
	
	public void searchForAccount() throws InterruptedException 
    {
		driver.findElement(searchAccount).sendKeys("Accounts");
		Thread.sleep(2000);
    }
	
	
	public void selectForAccount() throws InterruptedException 
    {
		
		driver.findElement(selectAccount).click();
		Thread.sleep(2000);
		    
     }
	
	public void selectNewButton() throws InterruptedException
	{
		driver.findElement(newAccount).click();
		Thread.sleep(2000);
	}
	public void recordType()
	{
		
	}
	public void next() throws InterruptedException
	{
		driver.findElement(nextButton).click();
		
		
	}  
	
	public void setLastName()
    {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(lastName).sendKeys("New_Account");
    }

	
	public void clickOnSave()
	{
		driver.findElement(saveButton).click();
	} 
}
    

	
	
	
	
	
	

