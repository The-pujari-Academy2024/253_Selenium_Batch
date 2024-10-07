package TestNG_Script;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case execution is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("This test case is passed ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This test case is failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped test cases");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	

}
