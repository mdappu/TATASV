package Pages;

import org.openqa.selenium.By;


//mngr532503
//EjAtAqU
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{
	WebDriver driver;
	
		
	public LoginPage(WebDriver driver) {
		super(driver);          //Multiple "Constructor" using in different classes we can use "Super()" Method or "Super Constructor"
		this.driver=driver;    //If below methods call into Test, 
		                       //both in LoginPage and Test having same WebDriver we can use "Constructor use" with same name and an initialization as single "WebDriver"
	
		}
	
	
	//Locators Elements
	
	By UserID= By.name("uid");
	By Uword=By.name("password");
	By Submit=By.name("btnLogin");
	
	
	
	public void Login_details() {
		
		SendKeys(UserID, "mngr532503");//Method
		SendKeys(Uword, "EjAtAqU");//Method
		Click(Submit);   //Method 
		
		
		}
	
	}

	
	
  