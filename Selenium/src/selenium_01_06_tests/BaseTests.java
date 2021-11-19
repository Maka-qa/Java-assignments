package selenium_01_06_tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import selenium_01_06_pages.CartPage;
import selenium_01_06_pages.MainNavigation;
import selenium_01_06_pages.MyAccountPage;
import selenium_01_06_pages.ShopPage;
public class BaseTests {
	WebDriver driver;
	MainNavigation mainNavigation;
	MyAccountPage myAccountPage;
	CartPage cartPage;
	ShopPage shopPage;
	
	@BeforeClass
	public void preSihTestova() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		mainNavigation = new MainNavigation(driver);
		myAccountPage =  new MyAccountPage(driver);
		cartPage = new CartPage(driver);
		shopPage = new ShopPage(driver);
	}
	@AfterClass
	public void posleSihTestova() {
		driver.close();
	}
}