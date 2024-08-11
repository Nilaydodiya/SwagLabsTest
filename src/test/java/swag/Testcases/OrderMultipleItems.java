package swag.Testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import swag.Pages.BaseTest;
import swag.Pages.inventoryPage;
import swag.Pages.createOrder;
import swag.Pages.loginPage;

public class OrderMultipleItems extends BaseTest {
	
	@BeforeClass
	void Setup()
	{
		BaseTest obj = new BaseTest(); 
	}
	@Test
	 void orderMultipleItems() throws InterruptedException
	{
		//Login with User
				loginPage loginPage = new loginPage(driver);
				inventoryPage inventoryPage = new inventoryPage(driver);
				createOrder createOrder = new createOrder(driver);
				loginPage.getUsername().sendKeys("standard_user");
				loginPage.getPassword().sendKeys("secret_sauce");
				loginPage.loginButton().click();
				
				//Submit Order
				inventoryPage.getBackpack().click();
				inventoryPage.getBikeLight().click();
				inventoryPage.getJakcet().click();
				inventoryPage.getOnesie().click();
				inventoryPage.getTshirt().click();
				inventoryPage.getRedShirt().click();
				
				createOrder.getCart().click();
				createOrder.getCheckout().click();
				createOrder.getFirstname().sendKeys("Test");
				createOrder.getLastname().sendKeys("User");
				createOrder.getPostalCode().sendKeys("380015");
				createOrder.getContinue().click();
				createOrder.getFinish().click();
				driver.quit();
				
	}

}
