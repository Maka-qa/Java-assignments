package primer1_tests;

import static org.testng.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class CartTests extends BaseTests{
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to("http://cms.demo.katalon.com/");
		driver.manage().window().maximize();
	}
	/*@Test(priority = 1)
	public void addProductToCartTest() {
		shopPage.addFlyingNinjaToCartButtonClick();
		shopPage.flyingNinjaViewCartButtonClick();
		String actualText = cartPage.textFromitem1ProductName();
		assertEquals(actualText, "Flying Ninja");
	}*/
	
	@Test(priority = 1)
	public void addProductToCartTest() {
		String textForAssertion = citacIzExcela.getStringData("Cart tests", 6, 2);
		shopPage.addFlyingNinjaToCartButtonClick();
		shopPage.flyingNinjaViewCartButtonClick();
		String actualText = cartPage.textFromitem1ProductName();
		assertEquals(actualText, textForAssertion);
	}

	
	@Test(priority = 2)
	public void addProduct2ToCartTest() {
		shopPage.addPatientToCartButtonClick();
		shopPage.patientNinjaViewCartButtonClick();
		String actualText = cartPage.textFromitem2ProductName();
		assertEquals(actualText, "Patient Ninja");
	}
	
	@Test(priority = 3)
	public void addProduct3ToCartTest() {
		shopPage.addFlyingNinjaToCartButtonClick();
		shopPage.happyNinjaViewCartButtonClick();
		String actualText = cartPage.textFromitem3ProductName();
		assertEquals(actualText, "Happy Ninja");
	}
	
	/*@Test(priority = 5)
	public void removeProductFromCartTest() {
		addProductToCartTest();
		cartPage.removeItem1ButtonClick();
		String actualText = cartPage.textFromEmptyCartLabel();
		assertEquals(actualText, "Your cart is currently empty.");
	}*/
	
	@Test(priority = 5)
	public void removeProductFromCartTest() {
		String textForAssertion = citacIzExcela.getStringData("Cart tests", 6, 3);
		addProductToCartTest();
		cartPage.removeItem1ButtonClick();
		String actualText = cartPage.textFromEmptyCartLabel();
		assertEquals(actualText, textForAssertion);
	}
	/*@Test(priority = 10)
	public void addProductTCard10Times() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			shopPage.addFlyingNinjaToCartButtonClick();
			Thread.sleep(200);
		}
		shopPage.flyingNinjaViewCartButtonClick();
		String actualText = cartPage.textFromTotalPriceForItem();
		assertEquals(actualText, "$120.00");
	}
	*/
	
	@Test(priority = 10)
	public void addProductTCard10Times() throws InterruptedException {
		String textForAssertion = citacIzExcela.getStringData("Cart tests", 6, 4);
		for (int i = 0; i < 10; i++) {
			shopPage.addFlyingNinjaToCartButtonClick();
			Thread.sleep(200);
		}
		shopPage.flyingNinjaViewCartButtonClick();
		String actualText = cartPage.textFromTotalPriceForItem();
		assertEquals(actualText, textForAssertion);
	}
	//provera broja dodatih proizvoda umesto ukupne cene svih proizvoda
		@Test(priority = 11)
		public void addProductTCard10Times1() throws InterruptedException {
			
			for (int i = 0; i < 10; i++) {
				
				shopPage.addFlyingNinjaToCartButtonClick();
				
				Thread.sleep(200);
			}
			
			shopPage.flyingNinjaViewCartButtonClick();
			
			String actualText1 = cartPage.numberAddedItems();
			
			assertEquals(actualText1, "10");
			
			
		}
	/*@Test(priority = 0)
	public void add3ProductTCard() throws InterruptedException {
		shopPage.addFlyingNinjaToCartButtonClick();
		shopPage.addHappyNinjaToCartButtonClick();
		shopPage.addPatientToCartButtonClick();
		
		Thread.sleep(500);
		
		mainNavigation.cartTabClick();
		
		List<WebElement> listaItemaUKorpi = cartPage.getCartItemsList();
		
		int actualNumberOfItems = listaItemaUKorpi.size();
		
		assertEquals(actualNumberOfItems, 3);*/
		//---------------------------------------------------
		/*  Milana primer
		mainNavigation.cartPageTabClick();
		Thread.sleep(2000);
		
		String actualText = cartPage.cartSubtotalMoney();
		assertEquals(actualText, "$65.00");
		*/
		
		@Test(priority = 0)
		public void add3ProductTCard() throws InterruptedException {
			int textForAssertion = citacIzExcela.getIntegerData("Cart tests", 6, 5);
			shopPage.addFlyingNinjaToCartButtonClick();
			shopPage.addHappyNinjaToCartButtonClick();
			shopPage.addPatientToCartButtonClick();
			Thread.sleep(500);
			mainNavigation.cartTabClick();
			List<WebElement> listaItemaUKorpi = cartPage.getCartItemsList();
			int actualNumberOfItems = listaItemaUKorpi.size();
			assertEquals(actualNumberOfItems, textForAssertion);
		}
		
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}


}