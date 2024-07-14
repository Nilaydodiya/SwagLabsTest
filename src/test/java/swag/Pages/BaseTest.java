package swag.Pages;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import swag.utility.BrowserFactory;
import swag.utility.ConfigDataProviders;

public class BaseTest {
	
		public WebDriver driver;
		public static Properties pro;
		public ConfigDataProviders config = new ConfigDataProviders();
		
		@BeforeClass
		public void setUp()
		{
			driver=BrowserFactory.startApplication(driver,config.getBrowser(),config.getStagingUrl());
		}
		@AfterClass
		public void tearDown()
		{
			BrowserFactory.quitBrowser(driver);
		}
	 
		/* public void captureScreenShot(WebDriver driver,String testName) throws IOException
	 {
		/* // Convert webdriver object to TakesScreenshot interface
		 TakesScreenshot screenshot= ((TakesScreenshot)driver);
		 
		 // Step 2 :call getScreenshotAs method to capture image file
		 
		 File src= screenshot.getScreenshotAs(OutputType.FILE);
		 File srcpath=new File("."+"//ScreenShots//"+ testName + ".png");
		 
		 // Step 3 : copy image file to destination 
		 FileUtils.copyFile(src, srcpath); */
			 
		public void captureScreenShot(WebDriver driver,String testName) throws IOException
		 {
			 // Convert webdriver object to TakesScreenshot interface
			 TakesScreenshot screenshot= ((TakesScreenshot)driver);
			 
			 // Step 2 :call getScreenshotAs method to capture image file
			 
			 File src= screenshot.getScreenshotAs(OutputType.FILE);
			 File srcpath=new File("."+"//ScreenShots//"+ testName + ".png");
			 
			 // Step 3 : copy image file to destination 
			 FileUtils.copyFile(src, srcpath);	 
		 }	 

}
