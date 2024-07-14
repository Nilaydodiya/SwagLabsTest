package swag.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver driver;
	
	public loginPage(WebDriver lDriver)
	{
		super();
		this.driver=lDriver;
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath=".//div//input[@id='user-name']") WebElement username;
@FindBy(xpath=".//div//input[@id='password']") WebElement password;
@FindBy(xpath=".//input[@id='login-button']") WebElement loginbutton;
//


	public WebElement getUsername() {	
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	/*public WebElement getFullName(String Username) {	
		fullname.sendKeys(Username);
		return fullname;
	}*/
	public WebElement loginButton() {	
		return loginbutton;

	}
}
