package selenium_31_05;
//dodati Asserte na testove za domaci
/* napisati test za log in u http://cms.demo.katalon.com/





20:15
kredencijali customer 123456789

Milovan Pocek  20:16
test napisati koristeci test ng notacije

1 reply
9 days agoView thread

Milovan Pocek  21:17
dodati 3 testa:
 logovanje bez kredencijala
21:18
logovanje sa pogresnim kredencijalima
21:18
log out test
 */

//
//
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
public class Zadatak {
	
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
		
		driver.navigate().to("http://cms.demo.katalon.com/my-account/");
		driver.manage().window().maximize();
	
	}
	
	@Test (priority = 0)
	public void LogovanjeSaDobrimKredencijalima() {
		
		WebDriverWait cekanje = new WebDriverWait(driver, 10);
		WebElement username = cekanje.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"username\"]")));
		username.sendKeys("customer");
		
		WebDriverWait cekanje1 = new WebDriverWait(driver, 10);
		WebElement password = cekanje1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]")));
		password.sendKeys("123456789");
		
		WebDriverWait cekanje2 = new WebDriverWait(driver, 10);
		WebElement logIn = cekanje2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button")));
		logIn.click();
	}
	
	@Test (priority = 5)
	public void LogovanjeSaPogresnimUsername() {
		WebDriverWait cekanje = new WebDriverWait(driver, 10);
		WebElement username = cekanje.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"username\"]")));
		username.sendKeys("Ivan");
		
		WebDriverWait cekanje1 = new WebDriverWait(driver, 10);
		WebElement password = cekanje1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]")));
		password.sendKeys("123456789");
		
		WebDriverWait cekanje2 = new WebDriverWait(driver, 10);
		WebElement logIn = cekanje2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button")));
		logIn.click();
	}
	
	@Test (priority = 10)
	public void LogovanjeSaPogresnimPassword() {
		WebDriverWait cekanje = new WebDriverWait(driver, 10);
		WebElement username = cekanje.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"username\"]")));
		username.sendKeys("customer");
		
		WebDriverWait cekanje1 = new WebDriverWait(driver, 10);
		WebElement password = cekanje1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]")));
		password.sendKeys("Ivan");
		
		WebDriverWait cekanje2 = new WebDriverWait(driver, 10);
		WebElement logIn = cekanje2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button")));
		logIn.click();
	}
	
	@Test (priority = 15)
	public void LogovanjeBezKredencijala() {
		WebDriverWait cekanje = new WebDriverWait(driver, 10);
		WebElement login = cekanje.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button")));
		login.click();
	}
	
	@Test (priority = 20)
	public void logout () {
		LogovanjeSaDobrimKredencijalima();		
		WebDriverWait cekanje = new WebDriverWait(driver, 10);
		WebElement logOut = cekanje.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/main/article/div/div/div/p[1]/a\r\n")));
		logOut.click();
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