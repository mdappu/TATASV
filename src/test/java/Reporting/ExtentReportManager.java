package Reporting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{
	
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
	 
		extent=new ExtentReports();
		spark=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/myextentreport.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Regression Testing");
		spark.config().setTheme(Theme.STANDARD);
		
		extent.attachReporter(spark);
		
		extent.setSystemInfo("Tester", "Manjula");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser", "Chrome");
		
	}
	
	public void onTestSuccess(ITestResult result) {
	    test=extent.createTest(result.getName());
	    test.log(Status.PASS, result.getName()+" Test is Passed");
	  }

	  public void onTestFailure(ITestResult result) {
		  test=extent.createTest(result.getName());
		    test.log(Status.FAIL, result.getName()+" Test is Failed");
	  }

	  public void onTestSkipped(ITestResult result) {
		  test=extent.createTest(result.getName());
		    test.log(Status.SKIP, result.getName()+" Test is Skipped");
	  }
	
	 public void onFinish(ITestContext context) {
		    extent.flush();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
