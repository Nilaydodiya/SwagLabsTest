package swag.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import swag.Pages.BaseTest;
import swag.Pages.loginPage;

public class LoginVerification extends BaseTest  {

	@BeforeClass
	void Setup()
	{
		BaseTest obj = new BaseTest(); 
	}
	@Test
	void verifygoodluckpage() throws InterruptedException
	{
		loginPage loginPage = new loginPage(driver);
		
		loginPage.getUsername().sendKeys("standard_user");
		loginPage.getPassword().sendKeys("secret_sauce");
		loginPage.loginButton().click();
		System.out.println("Nilay");		
	}
}
	


