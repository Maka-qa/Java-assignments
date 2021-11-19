package domaciSelenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/* Treba da na zadatak gde testiramo log in button
 *  katalon stranice dodamo assert metode.
 *   Znaci da u svakom testu, imamo proveru da li je test prosao
 *    preko assert-a */


public class Domaci_31_05 {

WebDriver driver;
	
	@BeforeClass
	public void preSihTestova() {
		//ovo sluzi samo za ispis, nije neophodno
		System.out.println("============================");
		System.out.println("Ispis pre svih testova");
		System.out.println("============================");
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void preSvakogTesta() throws InterruptedException {
		System.out.println("--------------------------------");
		System.out.println("Ispis pre svakog testa");
		
		driver.navigate().to("http://cms.demo.katalon.com/");
		driver.manage().window().maximize();
}
	
	@Test(priority = 0)
	public void loginValidCredentials() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[3]/a")).click();
		//  fill form
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("customer");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456789");
		
		//  remember me 
		driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button")).click();
		
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[3]/a")).click();
		String actualText = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/p[1]/a")).getText();
		
		assertEquals(actualText, "Log out");	
	}
	
	@Test(priority = 5)
	public void loginInvalidCredentials() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[3]/a")).click();
		//  fill form
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Marija");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456789");
		
		//  remember me 
		driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button")).click();
		
		// Thread.sleep(2000);
	
		String actualText = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/ul/li")).getText();
		
		assertEquals(actualText, "ERROR: Invalid username. Lost your password?");	
	}
	
	@Test (priority = 10)
	public void LogovanjeSaPogresnimPassword() {
		WebDriverWait cekanje = new WebDriverWait(driver, 10);
		WebElement username = cekanje.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"username\"]")));
		username.sendKeys("customer");
		
		WebDriverWait cekanje1 = new WebDriverWait(driver, 10);
		WebElement password = cekanje1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]")));
		password.sendKeys("Marija");
		
		WebDriverWait cekanje2 = new WebDriverWait(driver, 10);
		WebElement logIn = cekanje2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button")));
		logIn.click();
		
		String actualText = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/ul/li")).getText();
		
		assertEquals(actualText, "ERROR: The password you entered for the username customer is incorrect. Lost your password?");	
	}
	
	
	@Test (priority = 15)
	public void LogovanjeBezKredencijala() {
		WebDriverWait cekanje = new WebDriverWait(driver, 10);
		WebElement login = cekanje.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button")));
		login.click();
		
		String actualText = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/ul/li")).getText();
		
		assertEquals(actualText, "Error: Username is required.");	
	
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

