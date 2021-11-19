package domaciSelenium;

/* Dragoljub Boranijašević  22:08
Domaci @here
Nadovezuje se na domaci koji sam dao juce tako da necete praviti 
novu klasu nego cete samo dopuniti sta ste juce radili. 
Treba da promenite svaki threadsleep u wdwait,
 da na pocetku pre klika na "Elements" otvorite 2 taba,
  u ta dva taba da otvorite Facebook i Youtube,
   posle toga je potrebno zatvoriti samo Facebook tab. 
   Nakon toga se nastavlja izvrsavanje koda od juce sta sam dao.





22:10
Neobavezni logicki zadaci:
1 - A farmer needs to take a fox, a chicken, and a sack of grain across a river.
The only way across the river is by a small boat, which can only hold the farmer and one of the three items.
Left unsupervised, the chicken will eat the grain, and the fox will eat the chicken. However, the fox won’t try to eat the grain,
and neither the fox nor the chicken will wander off. How does the farmer get everything across the river?
2 - If you have a 7-minute hourglass and an 11-minute hourglass, how can you boil an egg in exactly 15 minutes?  */


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Domaci_28_05 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		Thread.sleep(2000);
		
		js.executeScript("window.open()");
		Thread.sleep(2000);
	
		driver.navigate().to("https://www.google.com/search?q=facebook&rlz=1C1CHBF_enMT867MT867&oq=fac&aqs=chrome.0.0j69i57j46i175i199j69i61l2j69i65l3.1662j0j7&sourceid=chrome&ie=UTF-8");
		
		driver.getWindowHandles();
		ArrayList<String> listaRuckiProzora = new ArrayList<String>(driver.getWindowHandles());
		for (int i = 0; i < listaRuckiProzora.size(); i++) {
			System.out.println(listaRuckiProzora.get(i));
		}
		driver.switchTo().window(listaRuckiProzora.get(1));
		driver.navigate().to("https://www.google.com/search?q=facebook&rlz=1C1CHBF_enMT867MT867&oq=fac&aqs=chrome.0.0j69i57j46i175i199j69i61l2j69i65l3.1662j0j7&sourceid=chrome&ie=UTF-8");
		
		driver.switchTo().window(listaRuckiProzora.get(2));
		driver.navigate().to("https://www.youtube.com/");
		
		driver.switchTo().window(listaRuckiProzora.get(1));
		driver.close();
		Thread.sleep(2000);

		WebDriverWait cekanje = new WebDriverWait(driver, 7);
		
		
		WebElement elements = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]")));
		elements.click();
		
		WebElement textBook = cekanje.until(ExpectedConditions. elementToBeClickable
				(By.id("item-0")));
		textBook.click();
		
		WebElement name = cekanje.until(ExpectedConditions. elementToBeClickable
				(By.id("userName")));
		name.sendKeys("Marija Milojevic");
		
		WebElement email = cekanje.until(ExpectedConditions. elementToBeClickable
				(By.id("userEmail")));
		email.sendKeys("marija.mljvc@gmail.com");
		
		WebElement currentAddress = cekanje.until(ExpectedConditions. elementToBeClickable
				(By.id("currentAddress")));
		currentAddress.sendKeys("Novi Sad");
		
		WebElement permanentAddress = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.id("permanentAddress")));
		permanentAddress.sendKeys("Novi Sad");
		
		WebElement submitButton = cekanje.until(ExpectedConditions. elementToBeClickable
				(By.xpath("//*[@id=\"submit\"]")));
		submitButton.click();
		
		if (submitButton.isDisplayed()) {
			System.out.println("izvrseno biranje");
		}
		else {
			System.out.println("nije izvrseno biranje");
		}
		
		WebElement checkBox = cekanje.until(ExpectedConditions. elementToBeClickable
				(By.id("item-1")));
		checkBox.click();
		
		WebElement homeButton = cekanje.until(ExpectedConditions. elementToBeClickable
				(By.className("rct-checkbox")));
		homeButton.click();
		
		if (homeButton.isEnabled()) {
			System.out.println("dugme je obelezeno");
		}
		else {
			System.out.println("dugme nije obelezeno");
		}
		
		WebElement radioBox = cekanje.until(ExpectedConditions. elementToBeClickable
				(By.id("item-2")));
		radioBox.click();
		
		WebElement yesButton = cekanje.until(ExpectedConditions. elementToBeClickable
				(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/label")));
		yesButton.click();
		
		if (yesButton.isEnabled()) {
			System.out.println("dugme je omoguceno");
		}
		else {
			System.out.println("dugme nije omoguceno");
		}
		System.out.println("Kraj programa.");
	}
}