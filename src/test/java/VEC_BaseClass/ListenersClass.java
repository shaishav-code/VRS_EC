package VEC_BaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resource.Extend_report;


public class ListenersClass extends BASE_CLASS implements ITestListener {
		ExtentTest test;
		WebDriver driver;
	ExtentReports extent = Extend_report.extentReportGenerator();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
		
	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Test case started :"+result.getName());
	test = extent.createTest(result.getName());
	extentTest.set(test); 
	}
	
	 
	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("Test case passed :"+result.getName());
	test.log(Status.PASS, "Test case is passed");
	extentTest.set(test); 
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//test.log(Status.FAIL, "Test Failed");
		//test.fail(result.getThrowable());
	
		System.out.println("Test case Failed :"+result.getName());
		test.fail(result.getThrowable());
		
		try {
			driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// Take screen and Attached to reports
		String srcFilePath = null;
		try {
			srcFilePath = getScreenshots(result.getMethod().getMethodName(), driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//extentTest.get().addScreenCaptureFromPath(srcFilePath, result.getMethod().getMethodName());
		test.addScreenCaptureFromPath(srcFilePath, result.getMethod().getMethodName());		
	

	}


	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case got skipped :"+result.getName());
		extentTest.set(test); 

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test started :"+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test completed :"+context.getName());
		extent.flush();
	}

		
	}
		

	
	
