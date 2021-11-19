package domaci_25_05;

/* Napisati automatski test koji:
Ocitava stranicu https://demoqa.com/ (inace stranica je namenjena za automatsko testiranje i
odlicna je za pocetak pa mozete ako zelite proci kroz sve delove stranice)
Klikne na "Elements"
Klikne na "Text Box"
Polje "Full name" ocisti pa unese vase ime - ciscenje se radi tako sto napisete ime elementa
kako ste ga nazvali i dodate .clear() na primer za element username bi bilo username.clear();
U polje "Email" unesite vas email
Kliknete na "Check Box"
Kliknete na strelicu da se spusti dropdown lista (levo od "Home" dugme)
Selektujete samo "Desktop"
Kliknete ponovo na "Elements" da se zatvori spisak
Na kraju stavite sleep 5 sekundi i zatvorite program

 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci_25_05 {

	public static void main(String[] args) throws InterruptedException {
	


				
				System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.com");
				driver.navigate().to("https://demoqa.com/");
				Thread.sleep(1000);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				
				WebElement elements = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
				elements.click();
				Thread.sleep(2000);

				
				WebElement textBox = driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
				textBox.click();
				Thread.sleep(2000);

				
				WebElement fullName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
				fullName.clear();
				Thread.sleep(2000);
				fullName.sendKeys("Marija");
				Thread.sleep(2000);
				
				WebElement eMail = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
				eMail.sendKeys("marija.mljvc@gmail.com");;
				Thread.sleep(2000);

				WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
				checkBox.click();;
				Thread.sleep(2000);
				
				WebElement toogle = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));;
				toogle.click();;
				Thread.sleep(2000);
				
				
				WebElement selectDesktopButton = driver.findElement(By.xpath("/html/body"));
				selectDesktopButton.click();;
				Thread.sleep(2000);
				
				WebElement againElements = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]"));
				againElements.click();;
				Thread.sleep(5000);
				

				
				
				
				driver.close();

}
}
