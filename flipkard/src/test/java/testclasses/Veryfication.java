package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import flipkard.HomePage;
import flipkard.LoginPage;
import flipkard.Travels;

public class Veryfication {

	
public static void main(String[] args) throws InterruptedException
{
	
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\tejal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");

	LoginPage loginPage = new LoginPage(driver);
	loginPage.sendMobileNo();
    loginPage.sendPassword();
	loginPage.clickLogin();
	
	//1test
        HomePage homepage = new HomePage(driver);
//         Thread.sleep(2000);
//         homepage.clickOnMobileTab();
//         Thread.sleep(2000);
//         homepage.clickOnrealmeTab();
//         
//      
//          String url =driver.getCurrentUrl();
//          System.out.println(url);
//          String title =driver.getTitle();
//          System.out.println(title);
//          
//          if (url.equals("https://www.flipkart.com/mobiles/pr?sid=tyy%2C4io&p%5B%5D=facets.brand%255B%255D%3Drealme&p%5B%5D=facets.availability%255B%255D%3DExclude%2BOut%2Bof%2BStock&param=7564&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIlNob3AgTm93Il0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fX19fQ%3D%3D&otracker=clp_metro_expandable_1_3.metroExpandable.METRO_EXPANDABLE_Shop%2BNow_mobile-phones-store_Q1PDG4YW86MF_wp2&fm=neo%2Fmerchandising&iid=M_1beb4480-5432-48e0-9b6d-a8afc9a81f25_3.Q1PDG4YW86MF&ppt=hp&ppn=homepage&ssid=0rpx32m58g0000001653959628117")&& 
//        		  title.equals("Mobile Phones Online at Best Prices in India"))
//          { 
//        	  System.out.println("Pass");
//        	  }
//          else
//          {
//        	  System.out.println("Fail");
//          }
//          
          
          
          
          //2test
      
          Thread.sleep(2000);
         homepage.clickOnTravelTab();
          Thread.sleep(2000);
         Travels travels  = new Travels(driver);
         Thread.sleep(2000);
         travels.clickOnFromTab();
         Thread.sleep(2000);
         travels.clickOnToTab();
         Thread.sleep(2000);
         travels.clickOnDateTab();
         Thread.sleep(2000);
//    travels.clickOnJune8Tab();
//       Thread.sleep(2000);
//        travels.clickOnEconomyTab();
//         travels.clickOnReturnOnTab();
//         travels.clickOnSearchTab();
//         
//          
//          url =driver.getCurrentUrl();
//           System.out.println(url);
//          title =driver.getTitle();
//           System.out.println(title);
//           
//          if (url.equals("https://www.flipkart.com/travel/flights?param=DTNavIcon&fm=neo%2Fmerchandising&iid=M_760e456e-9ccc-46b4-a53b-623f2ffaf1cb_1_372UD5BXDFYS_MC.V4ZPKTOAO321&otracker=hp_rich_navigation_8_1.navigationCard.RICH_NAVIGATION_Travel_V4ZPKTOAO321&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_8_L0_view-all&cid=V4ZPKTOAO321")&& title.equals(": Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com")
//           		)
//          {
// 	         System.out.println("Pass");
//           }
//           else
//           {
//         	  System.out.println("Fail");
//           }
//           
//          
}


}

