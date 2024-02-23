package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import Pages.LoginPage;
import Pages.ManagersPage;

public class BaseTest {
	
	WebDriver driver;
	LoginPage LP;
	ManagersPage MP;
	
	@BeforeSuite
	void OpenApp() {
		driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LP= new LoginPage(driver);
		MP= new ManagersPage(driver);
	}
	
	@BeforeTest
	void Login(){
		LP.Login_details();
	}
	
	@AfterTest
	void Teardown() {
		driver.quit();
	}
	
	

}
