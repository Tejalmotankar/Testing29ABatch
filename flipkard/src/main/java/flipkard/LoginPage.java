package flipkard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement MobileNo;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement Password;
	
	@FindBy (xpath = "(//button[@type='submit'])[2]")
	private WebElement Login;
	
	@FindBy (xpath = "//div[text() ='OR']")
	private WebElement ORbutton;
	
	@FindBy (xpath = "//button[text() ='Request OTP']")
	private WebElement OTP;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void sendMobileNo()
	{
		MobileNo.sendKeys("8459575899");
	}
	
	public void sendPassword()
	{
		Password.sendKeys("gatha$123");
	}
	
	public void clickLogin()
	{
		Login.click();
	}
	
	
	
	//OR
	public void LoginApplication()
	{
		MobileNo.sendKeys("8459575899");
		Password.sendKeys("gatha$123");
		Login.click();
	}
	}
	
	

