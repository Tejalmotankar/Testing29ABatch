package flipkard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	  @FindBy (xpath="(//div[@class='eFQ30H'])[1]")
      private WebElement TopOffersTab;
	  //(//img[@class='_1aPR5_'])[1]
     
	  @FindBy (xpath="(//div[@class='eFQ30H'])[2]")
      private WebElement GroceryTab;
     
     @FindBy (xpath="(//div[@class='eFQ30H'])[3]")
     private WebElement MobileTab;
     
     @FindBy (xpath="(//img[@class='_1aPR5_'])[1]")
     private WebElement realmeTab;

     @FindBy (xpath="(//div[@class='eFQ30H'])[4]")
     private WebElement FashionTab;
     
     @FindBy (xpath="//a[text()='Women Ethnic']")
     private WebElement WomenEthnicTab;
     
     @FindBy (xpath="(//div[@class='eFQ30H'])[5]")
     private WebElement ElectronicTab;
     
     @FindBy (xpath="(//div[@class='eFQ30H'])[6]")
     private WebElement HomeTab;
     
     @FindBy (xpath="(//div[@class='eFQ30H'])[7]")
     private WebElement ApplianceTab;
     
     @FindBy (xpath="(//div[@class='eFQ30H'])[8]")
     private WebElement TravelTab;
     
     @FindBy (xpath="(//div[@class='eFQ30H'])[9]")
     private WebElement ToyTab;
     
     
     public HomePage(WebDriver driver)
     {
  	   PageFactory.initElements(driver, this);
     }
     
     
//      Actions act =new Actions(driver);
//	  act.moveToElement(MobileTab).click().perform();
//     
     public void clickOnTopOffersTab()
     {
    	 TopOffersTab.click(); 
     }
     
     public void clickOnGroceryTab()
     {
    	 GroceryTab.click(); 
     }
     
     public void clickOnMobileTab()
     {
    	 MobileTab .click();
     }
     public void clickOnrealmeTab()
     {
    	 realmeTab.click();
     }
     public void clickOnFashionTab()
     {
    	 FashionTab.click(); 
     }
   //a[text()='Women Ethnic']
     
     public void clickOnWomenEthnicTab()
     {
    	 WomenEthnicTab.click(); 
     }
     
     
     public void clickOnElectronicTab()
     {
    	 ElectronicTab.click(); 
     }
     public void clickOnHomeTab()
     {
    	 HomeTab.click(); 
     }
     public void clickOnApplianceTab()
     {
    	 ApplianceTab.click(); 
     }
     public void clickOnTravelTab()
     {
    	 TravelTab.click(); 
     } 
     public void clickOnToyTab()
     {
    	 ToyTab.click(); 
     }
     
   

}