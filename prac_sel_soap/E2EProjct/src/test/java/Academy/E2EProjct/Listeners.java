package Academy.E2EProjct;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReporterNg;
import resources.base;

public class Listeners extends base implements ITestListener {

	ExtentTest test;
	ExtentReports extent=ExtentReporterNg.getReportObject();
	ThreadLocal<ExtentTest> extentTest= new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().log(Status.PASS, "Test Passed Fardeen you rock");
//		test.pass("The test was good and every thing passed");
//		extentTest.set(test);
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//put the screen shot 
		
		extentTest.get().fail(result.getThrowable());
		
		WebDriver driver =null;
		String testMethodName=result.getMethod().getMethodName();
		
		try {
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e1) 
		{
			// TODO Auto-generated catch block
		}
		
		try {
			extentTest.get().addScreenCaptureFromPath(getScreenShots(testMethodName, driver), result.getMethod().getMethodName()+"Failure_SS");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		extentTest.set(test);
	}

	

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
//		extentTest.set(test);
	}
	

	

	
	

}
