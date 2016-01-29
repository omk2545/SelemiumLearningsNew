package learning.selenium.tests;

import learning.selenium.ExtentReportFactories.SimpleReportFactory;
import learning.selenium.utilities.ErrorUtils;
import learning.selenium.utilities.TestUtils;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogLevel;
import com.relevantcodes.extentreports.LogStatus;

public class TestClass {
	public static ExtentReports reporter = SimpleReportFactory.getReporter();
	
		
	
	@Test
public void test0003() throws Throwable{
		
		this.getCurrentMethodName(Thread.currentThread());
		System.out.println("In main methodf :: "+Thread.currentThread().getStackTrace()[1].getMethodName());
	ExtentTest testReporter = reporter.startTest(Thread.currentThread().getStackTrace()[1].getMethodName() , "This is a simple simpleTest001");
	 
		
		try {
			
			Assert.assertTrue(false);
			
			
		} catch (Throwable t) {
			ErrorUtils.addVerificationFailure(t);
			testReporter.log( LogStatus.FAIL, t.toString());
			TestUtils.ScreenCap(System.getProperty("user.dir")+ "\\src\\learning\\selenium\\screenshots\\"+this.getClass().getSimpleName()+".jpg");
			
			
		}
		reporter.endTest(testReporter);
		
	}
	
	
	
	
	
	
		@Test
		public void complexTest001() {
			
			
			ExtentTest testReporter = reporter.startTest("complexTest001", "This is a simple simpleTest001");
			
			testReporter.log(LogStatus.PASS, "Starting test complexTest001");
			int a = 100;
			int b = 30;

			testReporter.log(LogStatus.INFO, "Loading the value of a to " + a);
			testReporter.log(LogStatus.FAIL, "Loading the value of b to " + b);
			reporter.endTest(testReporter);
		}

	/*	@Test
		public void complexTest002() {
			ExtentTest testReporter = reporter.startTest("complexTest002", "This is a simple simpleTest001");
			testReporter.log(LogStatus.INFO, "Starting test complexTest002");
			int a = 100;
			int b = 30;

			testReporter.log(LogStatus.INFO, "Loading the value of a to " + a);
			testReporter.log(LogStatus.PASS, "Loading the value of b to " + b);
			testReporter.log(LogStatus.PASS, "Here The test Passes And the values is retained ");
			reporter.endTest(testReporter);

		}*/
		
		@AfterSuite
		public void afterSuite()
		{
			reporter.close();
		}

		
		
		public  String getCurrentMethodName (Thread thread){
			//Thread.currentThread().getStackTrace()[1].getMethodName();
			System.out.println("Inside Method $$$$ 1"+Thread.currentThread().getStackTrace()[1].getMethodName());
			System.out.println("Inside Method $$$$ 2"+thread.getStackTrace()[1].getMethodName());
			return Thread.currentThread().getStackTrace()[1].getMethodName() ;
		

			
		}
		
	/*	public static void EndTest()
		{
			reporter.endTest(testReporter);
			
		}		*/
		
		
		
}
