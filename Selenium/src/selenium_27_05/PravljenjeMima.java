package selenium_27_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PravljenjeMima {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://imgflip.com/memegenerator");
		Thread.sleep(1000);
		WebElement dugneZaDodavanjeTemplejta = driver.findElement(By.id("mm-show-upload"));
		dugneZaDodavanjeTemplejta.click();
		Thread.sleep(1000);
		WebElement dugneZaDodavanjeSlike = driver.findElement(By.id("mm-upload-file"));
		Thread.sleep(1000);
		//ovde dodate putanju do slike na vasem racunaru
		dugneZaDodavanjeSlike.sendKeys("C:\\Users\\Dell\\Desktop");
		Thread.sleep(1000);
		WebElement dugneUpload = driver.findElement(By.id("mm-upload-btn"));
		dugneUpload.click();
		WebElement gornjiText = driver.findElement(By.xpath("//*[@id=\"mm-settings\"]/div[5]/div[1]/div[1]/textarea"));
		Thread.sleep(1000);
		gornjiText.sendKeys("najvaznija je");
		Thread.sleep(1000);
		WebElement donjiText = driver.findElement(By.xpath("//*[@id=\"mm-settings\"]/div[5]/div[2]/div[1]/textarea"));
		Thread.sleep(1000);
		donjiText.sendKeys("prva nedelja kursa");
		Thread.sleep(1000);
		WebElement dugneGenerate = driver.findElement(By.xpath("//*[@id=\"mm-settings\"]/div[9]/div[5]/div[1]"));
		dugneGenerate.click();
	}
}

/* Zadatak  
 * 
 
   import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Zadatak {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://imgflip.com/memegenerator");
		Thread.sleep(1000);
		WebElement addImage = driver.findElement(By.xpath("//*[@id=\"mm-show-upload\"]"));
		addImage.click();
	    driver.findElement(By.xpath("//*[@id=\"mm-upload-file\"]")).sendKeys("C:\\Users\\bbc\\Desktop\\volimPivo.jpg");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mm-upload-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mm-settings\"]/div[5]/div[1]/div[1]/textarea")).sendKeys("Volim pivo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mm-settings\"]/div[5]/div[2]/div[1]/textarea")).sendKeys("Jer ne ostavlja fleke od kafe");
		driver.findElement(By.xpath("//*[@id=\"mm-settings\"]/div[9]/div[5]/div[1]")).click();
	}
}
   */
