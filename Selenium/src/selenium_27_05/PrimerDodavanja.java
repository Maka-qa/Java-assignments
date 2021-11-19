package selenium_27_05;

/* 
Milovan Pocek  13 days ago

package dodavanjeFajlova;

 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrimerDodavanja {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://crop-circle.imageonline.co/#circlecropresult");
		Thread.sleep(1000);
		
		WebElement dugneZaDodavanje = driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/div[3]/div/div[1]/label/span"));
		Thread.sleep(1000);
		
		dugneZaDodavanje.sendKeys("C:\\Users\\Dell\\Desktop\\Cvece");
	}
}