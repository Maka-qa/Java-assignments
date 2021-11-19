package selenium_25_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VezbaSelenium25_05 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement AddToChart = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[2]"));
		AddToChart.click();
		Thread.sleep(3000);
		
		WebElement cart= driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[1]/a"));
		cart.click();
		Thread.sleep(3000);
		driver.close();
	}
}