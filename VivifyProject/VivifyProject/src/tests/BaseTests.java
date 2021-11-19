package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.AllGalleriesPages;
import pages.CreateGalleryPage;
import pages.MyGalleriesPage;

public class BaseTests {
	WebDriver driver;
	ExcelReader excelReader;
	
	AllGalleriesPages allGalleriesPages;
	CreateGalleryPage createGalleryPage;
	MyGalleriesPage myGalleriesPage;
	
	//URLs and sheet names
		String homeUrl;
		String logInSheetName;
		String createGallerySheetName;
		String myGalleriesSheetName;

	
	@BeforeClass
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		excelReader =  new ExcelReader("data/MarijaMilojevicVivifyTestPlan.xlsx");
		//
		allGalleriesPages = new AllGalleriesPages(driver);
		createGalleryPage = new CreateGalleryPage(driver);
		myGalleriesPage = new MyGalleriesPage(driver);
		
		
		homeUrl = "https://gallery-app.vivifyideas.com/";
		logInSheetName = "Login Tests";
		createGallerySheetName = "CreateGallery Tests";
		myGalleriesSheetName = "MyGalleries Tests";
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}