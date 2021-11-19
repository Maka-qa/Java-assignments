package selenium_27_05;

/* primer dodavanja kolaca
  */

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DodavanjeCookie {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://cms.demo.katalon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Cookie milovan = new Cookie("milovan", "napravio sam kolac");
		driver.manage().addCookie(milovan);
	}
}
