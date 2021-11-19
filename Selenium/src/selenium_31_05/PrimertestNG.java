package selenium_31_05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class PrimertestNG {
	WebDriver driver;
	@BeforeClass 
	public void preSihTestova() {
		//ovo sluzi samo za ispis, nije neophodno
		System.out.println("============================");
		System.out.println("Ispis pre svih testova");
		System.out.println("============================");
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@BeforeMethod 
	public void preSvakogTesta() throws InterruptedException {
		
		System.out.println("--------------------------------");
		System.out.println("Ispis pre svakog testa");
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(1000);	
	}
	@Test
	public void trazenjeITBootcampaNaGooglu() throws InterruptedException {
		
		WebElement searchField = driver.findElement(By.name("q"));
		
		searchField.sendKeys("IT bootcamp");
		searchField.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement linkInSearchResult = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3"));
		linkInSearchResult.click();
		Thread.sleep(3000);
	}
	@Test
	public void trazenjeKupujemProdajemNaGooglu() throws InterruptedException {
		
		WebElement searchField = driver.findElement(By.name("q"));
		
		searchField.sendKeys("kupujem prodajem");
		searchField.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement linkInSearchResult = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3"));
		linkInSearchResult.click();
		Thread.sleep(3000);
	}
	@AfterMethod 
	public void posleSvakogTesta() {
		
		System.out.println("Ispis nakon svakog testa");
		System.out.println("--------------------------------");
		
		driver.manage().deleteAllCookies();
	}
	@AfterClass 
	public void posleSihTestova() {
		
		System.out.println("============================");
		System.out.println("Ispis posle svih testova");
		System.out.println("============================");
		
		driver.close();
	}
}