package OthersTask;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshots {

	@Test
	void screenshot () throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
		
		
		//Complete Screen
	
	/*TakesScreenshot TS=(TakesScreenshot)driver;
	
	File LoginPage= TS.getScreenshotAs(OutputType.FILE);//Screenshot will be converted to File Save
	
	File LoginTrg= new File("C:\\Users\\manju\\eclipse-workspace\\TATASV\\ScreenShot\\Guru.png");//Location and file format(png) of the Screenshot where it should be save
	
	FileUtils.copyFile(LoginPage, LoginTrg);*/
	
	
	//Elements
	
	WebElement guru99=driver.findElement(By.xpath("//html/body/div[1]/div[1]/div[2]/table/tbody/tr"));//Partial Screenshot of elements (4)
	
	File guru=guru99.getScreenshotAs(OutputType.FILE);//Screenshot will be converted to File Save
	
	File Gurutrg= new File(System.getProperty("user.dir")+"/ScreenShot/Guru5.png");//Location and file format(png) of the Screenshot where it should be save
		
	FileUtils.copyFile(guru, Gurutrg);
	
	}
	
	
	
}
