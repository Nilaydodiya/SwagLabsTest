package swag.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Listeners implements ITestListener{
	ExtentTest Test;
	ExtentReports extent = ExtentReportNG.getReportObject();
	@Override		
    public void onFinish(ITestContext Result) 					
    {		
       extent.flush();
    }		

    @Override		
    public void onStart(ITestContext Result)					
    {		
    		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
    {		
    		
    }		

    // When Test case get failed, this method is called.		
    @Override		
    public void onTestFailure(ITestResult Result) 					
    	{		
    		
    	System.out.println("The name of the testcase failed is :"+Result.getName());
    	Test.log(Status.FAIL, "Test is Failed");
    	
    	}		

    // When Test case get Skipped, this method is called.		
    @Override		
    public void onTestSkipped(ITestResult Result)					
    {		
    System.out.println("The name of the testcase Skipped is :"+Result.getName());					
    }		

    // When Test case get Started, this method is called.		
    @Override		
    public void onTestStart(ITestResult Result)					
    {		
    	Test = extent.createTest(Result.getMethod().getMethodName());  
    	Test.fail(Result.getThrowable());
    System.out.println(Result.getName()+" test case started");					
    }		

    // When Test case get passed, this method is called.		
    @Override		
    public void onTestSuccess(ITestResult Result)					
    {		
    System.out.println("The name of the testcase passed is :"+Result.getName());
    	Test.log(Status.PASS, "Test is Passed");
    }	

}
