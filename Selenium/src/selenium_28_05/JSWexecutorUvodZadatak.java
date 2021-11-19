package selenium_28_05;

/* Otvoriti 5 stranica i na svakoj otici na razliciti sajt
 *  i potom ih zatvoriti stranicu po stranicu */

	import java.util.ArrayList;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class JSWexecutorUvodZadatak {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com/");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.open()");
			Thread.sleep(2000);
			
			/*  
Dragoljub Boranijašević  20:39

			js.executeScript("window.open('https://www.linkedin.com/')");
			
mozete odmah u zagradu da ubacite koji link hocete da vam se otvori u tabu,
 samo sto unutar zagrade idu apostrofi umesto navodnika*/
			
			js.executeScript("window.open()");
			Thread.sleep(2000);
			
			js.executeScript("window.open()");
			Thread.sleep(2000);
			
			js.executeScript("window.open()");
			Thread.sleep(2000);
			
			//driver.navigate().to("https://blog.qatestlab.com/2020/05/13/bug-busters-a-day-in-the-life-of-qa-engineer/");
			driver.getWindowHandles();
			
			ArrayList<String> listaRuckiProzora = new ArrayList<String>(driver.getWindowHandles());
			for (int i = 0; i < listaRuckiProzora.size(); i++) {
				System.out.println(listaRuckiProzora.get(i));
			}
			driver.switchTo().window(listaRuckiProzora.get(2));
			driver.navigate().to("https://promenadanovisad.rs/");
			
			driver.switchTo().window(listaRuckiProzora.get(1));
			driver.navigate().to("https://www.kupujemprodajem.com/");
			
			driver.switchTo().window(listaRuckiProzora.get(0));
			driver.navigate().to("https://www.reddit.com/");
			
			driver.switchTo().window(listaRuckiProzora.get(3));
			driver.navigate().to("https://www.w3schools.com/");
			
			driver.switchTo().window(listaRuckiProzora.get(4));
			driver.navigate().to("https://coursehunter.net/");
			
			//driver.quit(); -->zatvara sve tab-ove, ali ce kod puci posle toga jer nema sta da izvrsava
			Thread.sleep(5000);
			driver.switchTo().window(listaRuckiProzora.get(0));
			driver.close();
			
			Thread.sleep(2000);
			driver.switchTo().window(listaRuckiProzora.get(1));
			driver.close();
			
			Thread.sleep(2000);
			driver.switchTo().window(listaRuckiProzora.get(2));
			driver.close();
			
			Thread.sleep(2000);
			driver.switchTo().window(listaRuckiProzora.get(3));
			driver.close();
			
			Thread.sleep(2000);
			driver.switchTo().window(listaRuckiProzora.get(4));
			driver.close();
			
			System.out.println("kraj.");
		}
	}

