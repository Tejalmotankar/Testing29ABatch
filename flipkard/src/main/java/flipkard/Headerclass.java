package flipkard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headerclass {

	@FindBy(xpath ="//div[@class='_3qX0zy']") 
	private WebElement ImageFlipkart;
	
	@FindBy(xpath ="//input[@type='text']") 
	private WebElement SearchTab;
	
	@FindBy(xpath ="(//div[@class='_28p97w'])[1]") 
	private WebElement MyAccountTab;
	
	@FindBy(xpath ="//a[@class='_3-PJz-']") 
	private WebElement BecameSellerTab;
	
	@FindBy(xpath ="(//div[@class='_28p97w'])[2]") 
	private WebElement MoreTab;
	
	@FindBy(xpath ="//a[@class='_3SkBxJ']") 
	private WebElement CartTab;
	
	@FindBy(xpath ="//div[text()='Logout']") 
	private WebElement LogOut;
	
	
	
	public Headerclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnImageFlipkart()
	{
		ImageFlipkart.click();
	}
	
	public void clickOnSearchTab()
	{
		SearchTab.click();
	}
	public void clickOnMyAccountTab()
	{
		MyAccountTab.click();
	}
	
	public void clickOnBecameSellerTab()
	{
		BecameSellerTab.click();
	}
	
	public void clickOnMoreTab()
	{
		MoreTab.click();
	}
	
	public void clickOnCartTab()
	{
		CartTab.click();
	}
	
	public void clickOnLogOut()
	{
		LogOut.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
