package domaci_03_06_base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import domaci_03_06_pages.MainPage;
import domaci_03_06_tests.ExcelReader;

public class BaseTests1 {
	public WebDriver driver1;

	public MainPage mainPage;

	public ExcelReader citacExcela;
	String homeUrl;

	@BeforeClass
	public void preSihTestova() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver1 = new ChromeDriver();
		driver1.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		mainPage = new MainPage(driver1);

		citacExcela = new ExcelReader("data/domaci_03_06.xlsx");

		homeUrl = "https://wordpress.com/";

	}

	@AfterClass
	public void posleSihTestova() {
		driver1.close();
	}
}
