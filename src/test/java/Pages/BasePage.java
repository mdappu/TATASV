package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	
	WebDriver driver;
	
   public BasePage(WebDriver driver) {
   this.driver=driver;
   
    }
   
     void Click(By Locator) {              //Click Method create only once we can use "Click" method in multiple pages
     driver.findElement(Locator).click();
    	 
    	 }

     void SendKeys(By Locator,String Text) {
    	 driver.findElement(Locator).sendKeys("Text");
    	 
     }

      void refresh() {
	    driver.navigate().refresh();
} 
    
      void DD() {
    	  driver.findElements(By.name("title"));
      }
      
      
   //String() {
	   
	   String text = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[1]/a")).getText();
   
	   //System.out.println(text);
   
   }
     
     
     
     

