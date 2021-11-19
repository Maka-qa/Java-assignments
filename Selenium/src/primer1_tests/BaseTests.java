package primer1_tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import primer1_pages.CartPage;
import primer1_pages.MainNavigation;
import primer1_pages.MyAccountPage;
import primer1_pages.ShopPage;

public class BaseTests {
	WebDriver driver;
	
	MainNavigation mainNavigation;
	MyAccountPage myAccountPage;
	ShopPage shopPage;
	CartPage cartPage;
	
	ExcelReader citacIzExcela;
	
	String homeUrl;
	
	@BeforeClass
	public void preSihTestova() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		mainNavigation = new MainNavigation(driver);
		myAccountPage =  new MyAccountPage(driver);
		shopPage =  new ShopPage(driver);
		cartPage = new CartPage(driver);
		
		citacIzExcela =  new ExcelReader("data/AutomationTestPlan.xlsx");
		
		homeUrl = "http://cms.demo.katalon.com/";
		
	}
	
	@AfterClass
	public void posleSihTestova() {
		driver.close();
	}
}


/*package primer1_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import primer1_pages.MainNavigation;
import primer1_pages.MyAccountPage;

public class BaseTests {
	WebDriver driver;
	MainNavigation mainNavigation;
	MyAccountPage myAccountPage;
	
	@BeforeClass
	public void preSihTestova() {
	
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		mainNavigation = new MainNavigation(driver);
		myAccountPage = new MyAccountPage(driver);

	}
	
	@AfterClass
	public void posleSihTestova() {
		System.out.println("============================");
		System.out.println("Ispis posle svih testova");
		System.out.println("============================");
		
		
		driver.close();
	}

}
*/
