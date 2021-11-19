package domaciSelenium;

/* Dragoljub Boranijašević  22:16
Domaci 27.05. @here
Otici na ovaj URL - https://demoqa.com/
Kliknuti na dugme Elements sa leve strane
Kliknuti na Text Box sa leve strane
Popuniti sva 4 polja, kliknuti na Submit i proveriti 
da li se resenje pojavilo ispod (ko zeli tezu varijatnu
 neka proveri da li je dobar ispis u smislu da li se ispisalo 
 ime koje se unelo)
Kliknuti na Check Box sa leve strane, cekirati Home i 
proveriti da li se izvrsilo cekiranje
Kliknuti na Radio Button sa leve strane, kliknuti na Yes
 i proveriti da li se izvrsilo biranje radio buttona
Kada kazem proveriti mislim da koristite if funkciju i
 da se ispise neki print
22:17
Ovaj sajt je namenjen za vezbanje seleniuma, ko hoce dodatno 
da vezba moze da proba sve ove elemente koji su prikazani
 sa leve strane
22:18
I nemoj se odmah lepiti za xpath da samo preko toga trazite elemente, 
pokusajte prvo ID ili class pa tek onda xpath ako bas se ne snadjete */



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Domaci_27_05 {
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
	
		WebDriverWait cekanje = new WebDriverWait(driver, 7);
		
		
		WebElement elements = cekanje.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]")));
		elements.click();
		
		WebElement textBook = cekanje.until(ExpectedConditions.elementToBeClickable
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