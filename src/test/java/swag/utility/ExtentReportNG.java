package swag.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {

	public static ExtentReports getReportObject()
	{
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		 reporter.config().setReportName("WebAutomation");
		 reporter.config().setDocumentTitle("QA");
		 
		 ExtentReports extent =new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("Tester", "Nilay");
		 return extent;
	}
	
}
