package swag.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class inventoryPage {

WebDriver driver;
	
	public inventoryPage(WebDriver lDriver)
	{
		super();
		this.driver=lDriver;
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath=".//div//button[@id='add-to-cart-sauce-labs-backpack']") WebElement addbackpack;
@FindBy(xpath=".//div//button[@id='add-to-cart-sauce-labs-bike-light']") WebElement addbikelight;
@FindBy(xpath=".//div//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") WebElement addtshirt;
@FindBy(xpath=".//div//button[@id='add-to-cart-sauce-labs-fleece-jacket']") WebElement addjacket;
@FindBy(xpath=".//div//button[@id='add-to-cart-sauce-labs-onesie']") WebElement addonesie;
@FindBy(xpath=".//div//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") WebElement addredshirt;


	public WebElement getBackpack() {	
		return addbackpack;
	}
	public WebElement getBikeLight() {
		return addbikelight;
	}
	public WebElement getTshirt() {	
		return addtshirt;
	}
	public WebElement getJakcet() {	
			return addjacket;
	}
	public WebElement getOnesie() {	
		return addonesie;
	}
	public WebElement getRedShirt() {	
		return addredshirt;
	}
}
