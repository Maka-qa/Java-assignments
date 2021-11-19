package selenium_27_05;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Napisati program koji:
●     Ucitava stranicu http://cms.demo.katalon.com/my-account/
●     Postavlja kolacic za ulogovanog usera         
●     Refresuje stranicu
●     Proverava da li je korisnik ulogovan */

public class Zadatak1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("http://cms.demo.katalon.com/my-account/");
		Thread.sleep(1000);
		
		driver.manage().deleteAllCookies();
		

		Cookie logIn = new Cookie("ime", "imelozinka44");
		driver.manage().addCookie(logIn);
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		
		
		WebElement account = driver.findElement(By.cssSelector(".page_item.page-item-10"));
		account.click();
		
		
		
		WebElement logOut = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/p[1]/a"));
		Thread.sleep(2000);
		if(logOut.isDisplayed()) {
			System.out.println("Korisnik je ulogovan.");
		}
		else {
			System.out.println("Korisnik nije ulogovan.");
		}
		
		
	}
}