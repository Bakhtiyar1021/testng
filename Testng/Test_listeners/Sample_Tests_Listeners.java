package framework.Testng.Test_listeners;

import org.testng.ITestContext;
import org.testng.ITestResult;

public class Sample_Tests_Listeners 
{
	 
	public void onTestStart(ITestResult result) 
	{
		
		
	}

	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("On Sucess Genarate Pass Report at Management Tooll");
		
	}

	public void onTestFailure(ITestResult result)
	{
		
		System.out.println("On failure genarate Fail Report at defect tacking tool");
	}

	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Prepare to rerun your test on next regression cycle");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("Failed with success percentage");
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
}
