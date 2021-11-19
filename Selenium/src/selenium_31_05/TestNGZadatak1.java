package selenium_31_05;

/* napisati test za log in u http://cms.demo.katalon.com/
20:15
kredencijali customer 123456789

Milovan Pocek  20:16
test napisati koristeci test ng notacije  */




import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNGZadatak1 {
	WebDriver driver;
	WebDriverWait wdwait;
	@BeforeClass 
	public void preSihTestova() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		wdwait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	}
	@BeforeMethod 
	public void navigacijaNaKatalonSajt() {		
		driver.navigate().to(" http://cms.demo.katalon.com/");
		
		wdwait = new WebDriverWait(driver, 10);
		
		WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[3]/a"));
		myAccount.click();
		
		wdwait = new WebDriverWait(driver, 10);
	}
	@Test (priority = 0)
	public void logovanjeValidnimKredencijalima() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("customer");
		
		wdwait = new WebDriverWait(driver, 10);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123456789");
		
		wdwait = new WebDriverWait(driver, 10);
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}
	@AfterMethod 
	public void posleSvakogTesta() {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	@AfterClass 
	public void posleSvihTestova() {		
		driver.close();
	}
}