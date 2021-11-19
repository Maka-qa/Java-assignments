package selenium_01_06_tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class CartTests extends BaseTests{
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to("http://cms.demo.katalon.com/");
		driver.manage().window().maximize();
	}
	@Test(priority = 0)
	public void addProductToCartTest() {
		shopPage.addFlyingNinjaToCartButtonClick();
		shopPage.flyingNinjaViewCartButtonClick();
		
		String actualText = cartPage.textFromitem1ProductName();
		assertEquals(actualText, "Flying Ninja");
	}
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}