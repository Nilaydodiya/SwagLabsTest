package swag.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createOrder {

WebDriver driver;
	
	public createOrder(WebDriver lDriver)
	{
		super();
		this.driver=lDriver;
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath=".//div//button[@id='add-to-cart-sauce-labs-bike-light']") WebElement addtocart;
@FindBy(xpath=".//div[@id='shopping_cart_container']") WebElement cart;
@FindBy(xpath=".//div//button[@id='checkout']") WebElement checkout;
@FindBy(xpath=".//div//input[@id='first-name']") WebElement firstname;
@FindBy(xpath=".//div//input[@id='last-name']") WebElement lastname;
@FindBy(xpath=".//div//input[@id='postal-code']") WebElement postalcode;
@FindBy(xpath=".//div//input[@id='continue']") WebElement continuee;
@FindBy(xpath=".//div//input[@id='finish']") WebElement finish;



	public WebElement getAddToCart() {	
		return addtocart;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getCheckout() {	
		return checkout;
	}
	public WebElement getFirstname() {	
			return firstname;
	}
	public WebElement getLastname() {	
		return lastname;
	}
	public WebElement getContinue() {	
		return continuee;
	}
	public WebElement getFinish() {	
		return finish;
	}
}
