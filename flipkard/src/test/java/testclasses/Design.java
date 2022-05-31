package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import flipkard.Headerclass;
import flipkard.HomePage;
import flipkard.LoginPage;

public class Design {
          WebDriver driver;
          LoginPage loginPage;
          HomePage homepage;
          Headerclass headerclass;
          
          @BeforeClass
          public void launchBrowser()
          {
        	  System.setProperty("webdriver.chrome.driver","C:\\Users\\tejal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
        	  driver =new ChromeDriver();
        		
          }
          
          @BeforeMethod
          public void LoginToApplication()
          {
        	  driver.get("https://www.flipkart.com/");
        	  LoginPage loginPage = new LoginPage(driver);
        		loginPage.sendMobileNo();
        	    loginPage.sendPassword();
        		loginPage.clickLogin();
        		 
          }
          
          @Test
          public void  clickOnMoblileTab() throws InterruptedException
          {
//        	  Actions act =new Actions(driver);
//        	  act.moveToElement(MobileTab).click().perform();
        	  Thread.sleep(2000);
            homepage.clickOnMobileTab();
            Thread.sleep(2000);
             homepage.clickOnrealmeTab();
            
         
             String url =driver.getCurrentUrl();
             System.out.println(url);
             String title =driver.getTitle();
             System.out.println(title);
             
             if (url.equals("https://www.flipkart.com/mobiles/pr?sid=tyy%2C4io&p%5B%5D=facets.brand%255B%255D%3Drealme&p%5B%5D=facets.availability%255B%255D%3DExclude%2BOut%2Bof%2BStock&param=7564&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIlNob3AgTm93Il0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fX19fQ%3D%3D&otracker=clp_metro_expandable_1_3.metroExpandable.METRO_EXPANDABLE_Shop%2BNow_mobile-phones-store_Q1PDG4YW86MF_wp2&fm=neo%2Fmerchandising&iid=M_1beb4480-5432-48e0-9b6d-a8afc9a81f25_3.Q1PDG4YW86MF&ppt=hp&ppn=homepage&ssid=0rpx32m58g0000001653959628117")&& 
           		  title.equals("Mobile Phones Online at Best Prices in India"))
             { 
           	  System.out.println("Pass");
           	  }
             else
             {
           	  System.out.println("Fail");
             }
          } 
          
             @AfterMethod
          public void LogoutApplication()
          {
            	 
        	  headerclass.clickOnLogOut();  
          }
          
          @AfterClass
          public void closeBrowser()
          {
        	  driver.close();
          }

}