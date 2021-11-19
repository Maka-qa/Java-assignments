package selenium_28_05;

/* 
  Napisacu u threadu ovde samo deo oko wdwait kako je meni
   preglednije za ono dugme popup close
  
  	WebElement popupClose = driver.findElement(By.className("close"));
	wdwait.until(ExpectedConditions.elementToBeClickable(By.className("close")));
	popupClose.click();
	
a pre toga mi stoji ova linija

	WebDriverWait wdwait = new WebDriverWait(driver, 10);
	
Kad mi je poredjano ovako u 3 reda mi lakse.
 U prvom sam nasao element, u drugom sam rekao da saceka 
 dok ne bude klikabilan i u trecem da odradi klik.
  Isto sve kao sto smo malopre radili samo drugacije napisano.

zatvoriti chat kad se sam otvori
 *  https://blog.qatestlab.com/2020/05/13/bug-busters-a-day-in-the-life-of-qa-engineer/  */

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WejteriZadatakQATestLabBlog {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.navigate().to(" https://blog.qatestlab.com/2020/05/13/bug-busters-a-day-in-the-life-of-qa-engineer/");
		driver.manage().window().maximize();
		
		WebDriverWait cekanje = new WebDriverWait(driver, 20);
		
		WebElement zatvaranjeChata = cekanje.until(ExpectedConditions.elementToBeClickable(By.className("closeIcon_5110")));
		zatvaranjeChata.click();
		System.out.println("Kraj");
}
}