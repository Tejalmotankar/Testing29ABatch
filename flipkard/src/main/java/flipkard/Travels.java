package flipkard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Travels {
	 @FindBy (xpath="(//input[@type=\"text\"])[1]")
     private WebElement FromTab;
     
     @FindBy (xpath="(//input[@type=\"text\"])[2]")
     private WebElement ToTab;
     
     
     
     @FindBy (xpath="//input[@type=\\\"text\\\"])[3]")
     private WebElement DateTab;
    
     
     @FindBy (xpath="//input[@type=\\\"text\\\"])[4]")
     private WebElement ReturnOnTab;
     
     @FindBy (xpath="//input[@type=\\\"text\\\"])[5]]")
     private WebElement EconomyTab;
     
     @FindBy (xpath="//span[text()='SEARCH']")
     private WebElement SearchTab;
     
     @FindBy (xpath=" //input[@value=\"8 Jun, Wed\"]")
     private WebElement June8Tab;
    
   
     
     public Travels(WebDriver driver)
     {
  	   PageFactory.initElements(driver, this);
     }
     
     
      public void clickOnFromTab ()
      {
    	  FromTab.sendKeys("Pune");
      }
      public void clickOnToTab ()
      {
    	  ToTab.sendKeys("Belgaum");
      }
      public void clickOnDateTab ()
      {
    	  DateTab.click();
      }
      public void clickOnReturnOnTab ()
      {
    	  ReturnOnTab.click();
      }
      public void clickOnEconomyTab ()
      {
    	  EconomyTab.click();
      }
      public void clickOnSearchTab ()
      {
    	  SearchTab.click();
      }
     
      public void clickOnJune8Tab()
      {
    	  June8Tab.click();
      }
     

}
