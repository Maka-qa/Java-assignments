package selenium_27_05;

/* primer sa brisanjem kolaca
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Zadatak2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://cms.demo.katalon.com/");
		driver.manage().window().maximize();
//		go to login page
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[3]/a"))
			.click();
		
//		fill form
		driver.findElement(By.xpath("//*[@id=\"username\"]"))
			.sendKeys("customer");
		driver.findElement(By.xpath("//*[@id=\"password\"]"))
			.sendKeys("123456789");
		
//		remember me
		driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/label"))
			.click();
		
		driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button"))
			.click();
		Thread.sleep(2000);
		
		
		driver.manage().deleteCookieNamed("wordpress_logged_in_4d8a854e0c8bd1c7f0585d2f4b3ad575");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}