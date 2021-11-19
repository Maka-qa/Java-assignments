package test5tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import test5pages.MainPage;
import test5pages.ProductsPage;

public class BaseTests {
	
 public	WebDriver driver;
	MainPage mainPage;
	ProductsPage productsPage;
	
	@BeforeClass
	public void preSihTestova() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		mainPage =  new MainPage(driver);
		productsPage = new ProductsPage(driver);
	}
	
	@AfterClass
	public void posleSvihTestova() {
		driver.close();
	}

}
