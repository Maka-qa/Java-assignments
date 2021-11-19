package test5tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTests
{
	
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to("https://www.saucedemo.com");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test(priority = 0)
	public void logInValidCredentials() throws InterruptedException {
		//Thread.sleep(1000);
		mainPage.insertUsername("standard_user");
		mainPage.insertPassword("secret_sauce");
		mainPage.logInButtonClick();
		Thread.sleep(1000);
		
		/*productsPage.menuButtonClick();
		Thread.sleep(2000);
		String actualText = productsPage.logOutButtonInMenu();
		Thread.sleep(2000);
		assertEquals(actualText, "Log out");*/
	
	}
	
	@Test(priority = 1)
	public void addProducts() throws InterruptedException {
		logInValidCredentials();
		
			productsPage.addSauceLabsBackpackClick();
			Thread.sleep(1000);

			productsPage.addSauceLabsBikeLightClick();
			Thread.sleep(1000);

			productsPage.addSauceLabsBoltTShirtClick();
			
			Thread.sleep(3000);
			
			productsPage.shoppingCartLinkClick();
			Thread.sleep(1000);

			
			String brojProizvoda = productsPage.shoppingCartLinkClick();
			Thread.sleep(1000);

			assertEquals(brojProizvoda, "3");
			
			
	}
	
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
	


