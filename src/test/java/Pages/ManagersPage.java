package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagersPage extends BasePage{
	
	WebDriver driver;
	
	public ManagersPage(WebDriver driver) {
		super(driver);    //super Constructor
		this.driver=driver; //Constructor
	}
	
	//Locators
	By NC=By.linkText("New Customer"); //To create paths or elements
	By Edit=By.linkText("Edit Customer"); //To create paths or elements
	By Manager=By.linkText("Manager");
	
	
	public void NewCustomer() {                  //To create a "NewCutomer" Method
		Click(NC); 
		refresh();                   // To Refresh the "Adds"
		Click(NC);
	}
	
	public void EditCustomer() {                  //To create a "NewCutomer" Method
		Click(Edit);
		refresh();                     // To Refresh the "Adds"	
		Click(Edit);
	}

	
	
	
	
	

}
