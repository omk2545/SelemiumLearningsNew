package learning.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test001 {
	private ExtentReports extent1;
	public WebDriver driver;
	
	@BeforeSuite
	void init(){
		extent1 = new ExtentReports("C:/Selenium_Projects/SeleniumBasicsNew/Extent.html",true );
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void test001(){
		
		 ExtentTest test = extent1.startTest("My second Test", "Sample description");
	        test.log(LogStatus.PASS, "details");
	        driver.get("https://www.flipkart.com");
		System.out.println("Pass");
		Assert.assertEquals(true, true);
		extent1.endTest(test);
		
	}
	

/*	@Test
	public void test002(){
		
		 ExtentTest test = extent1.startTest("My First Test", "Sample description");
	        test.log(LogStatus.FAIL, "details");
	        driver.get("https://www.google.co.in");
		System.out.println("Pass");
		Assert.assertEquals(true, true);
		extent1.endTest(test);
		
	}
	*/

	@Test
	public void test004(){
		
		ExtentTest test = extent1.startTest("Test004", "this test fails badly");
		
		driver.get("https://www.google.co.in");
		System.out.println("failed");
		test.log(LogStatus.FAIL, "failed");
		
		Assert.assertEquals(true, true);
	
		extent1.endTest(test);

	}
	

	
	
	/*@Test
	public void test003(){
		 ExtentTest test = extent1.startTest("Test03", "Sample description");
	        test.log(LogStatus.FAIL, "details");
	        
		System.out.println("false");
		Assert.assertEquals(true, false);
		extent1.endTest(test);
		
		
	}*/
	@AfterSuite
	public void closethings(){
		//extent1.close();
		 extent1.flush();
	driver.quit();	
		
	}

@AfterTest
public void close(){
	driver.close();
	
}

}
