package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage {
	
	WebDriver driver;
	
	public NewCustomerPage(WebDriver driver) {
		this.driver=driver;  //Constructor
		
	}
	
	By NC=By.linkText("New Customer"); //To create paths or elements
	By Edit=By.linkText("Edit Cutomer");// To create paths or elements
	
	void NewCustomer() {              //To create a "NewCutomer" Method
	driver.findElement(NC).click();
	driver.navigate().refresh();  //To Refresh the "Adds"
	driver.findElement(NC).click();
		}
	
	
	void EditCustomer() {              //To create a "NewCutomer" Method
	driver.findElement(Edit).click();
	driver.navigate().refresh();  //To Refresh the "Adds"
	driver.findElement(Edit).click();
		}
	
	
	
	
	
	
	
	//Paths  locators
	
	
	
	
	
	
	//Method  actions
	
	
	//public void new_Customer_Form() {
		//Customer Name
		//Gender
		//DOB} 

}


	
	
	
	
	
	
	
