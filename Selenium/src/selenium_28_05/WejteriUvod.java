package selenium_28_05;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WejteriUvod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		driver.manage().window().maximize();
		driver.navigate().to("https://promenadanovisad.rs/en/");
		Thread.sleep(1000);
		
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(10000);
		
		WebElement popUpClose = driver.findElement(By.xpath("//*[@id=\"page\"]/div/footer/div[2]/div[2]/span"));
		popUpClose.click();
		
		System.out.println("Kraj programa");
	}
}
/* Idite na sajt promenade https://promenadanovisad.rs/en/
Obrisite kolace
Kliknite refresh
Sacekajte dok se ne pojavi pop-up
Na pop-upu kliknite x(close) dugme
-----------------------------------------
Lokatori/Selektori - poredjani po prioritetu:
-id - najveci prioritet, jedinstven lokator (moze da se desi da je kopija, ali ne bi trebalo)
-name - drugi po prioritetu ali nije cest lokator
-class - napravljen po klasi, vazi samo kada je klasa jedna rec, odnosno kada nema razmak u klasi
-cssSelector - to je isti lokator kao class ali je nacinjen od dve ili vise reci, odnosno ima barem jedan razmak. Class se kopira i umesto razmaka i na pocetku se dodaje tacka za lokator
-relative xpath
-absolute xpath
primer razlike class i css:
prikazano je ovako => class: "jedan" ili mozda "jedan-dva-tri"
onda vidimo da nema razmaka i pisemo lokator
by.class("jedan-dva-tri");
prikazano je ovako => class: "jedan-dva-tri cetiri-pet sest-sedam"
ovde vidimo da ima razmak i onda pisemo lokator
by.cssSelector(".jedan-dva-tri.cetiri-pet.sest-sedam");
-----------------------------------------
Cisto da podelim moj tok razmisljanja dok pravim ove testove.
Ako naidjem na neki problem u svom testu prvo sto uradim je da dodam thread sleep pre toga, da vidim da li je do cekanja ili do elementa. Ako jeste problem bio kod cekanja onda posle samo thread sleep pretvorim u wdwait da ceka sto manje moze. Ako nije do cekanja onda je verovatno problem do pronalazenja elementa pa gledam da li na pravom mestu gledam inspect element ili iskoristim drugi lokator.
19:11
Primer iz prakse gde sam bas pomogao kolegi na poslu, on nije znao za ovaj wdwait pa je uvek koristio thread sleep, da bi stvar bila gora nekad je potrebno elementu i do 20 sekundi da se pojavi pa je svaki njegov thread sleep bio veliki. Kad je prebacio sve u wdwait kaze mi da mu se testovi izvrsavaju oko 20 minuta brze zbog toga.
------------------------------------
Polja i ispis imaju isti ID
22:45
Kada vam pronadje ime i email, ne pronalazi dole gde je ispisano nego gore vuce iz textboxa (jer je to prvi id koji je nasao)
22:46
Razlog zasto ne moze druga dva da prepozna jer su boxovi sa vise linija za upis, ime i mail imaju jednu liniju, druga dva imaju taj break gde moze da se pise u vise linija.
22:47
Da biste nasli ovaj ispis dole moze SAMO kada se koristi full xpath, ne moze ni relativni jer relativni gadja isti id kao gore nego mora full xpath (sto je lose ali to je jedina opcija)

Dragoljub Boranijašević  23:05
Drugi problem koji do juce nisam znao da postoji, a to je da vidljivost nekih elemenata zavisi od vaseg monitora. Ako koristite monitor veci je aspect ratio i mozda vidite vise elemenata, ko koristi laptop mozda ne moze da vidi neki element i pravi mu problem da mozda nece svaki put da pronadje jer nije prikazan.
23:05
Postoji 3 resenja za to
23:06
1 - Stavite thread sleep i rucno skrolate na taj element (ovo nikako ne bih preporucio da radite ali tehnicki jeste resenje)
23:07
2 - Na pocetku podesite drugaciji aspect ratio (takodje ne bih preporucio jer bi izoblicilo prozor u kome gledate pa bi bilo ili sitno ili krupno sve pa ne mozete videti sta se desava, a nekad ne moze ni da bude merodavno)
23:10
3 - Koristite ovo:
WebElement dugme = driver.findElement(By.cssSelector(".pagination-button.pagination-older"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dugme);
        Thread.sleep(2000);
        dugme.click();
Samo ova druga linija je novost, tu vam se odradi skrol do elementa dok ne bude fizicki vidljiv na ekranu. Stavio sam da se element zove dugme kako biste razlikovali gde treba da se doda taj element i cisto neki thread sleep da mozete da ispratite da se skrol zapravo desio.
:+1::skin-tone-3::+1:
2


Dragoljub Boranijašević  23:33
3b - Moze i ovako na drugi nacin kao ovo iznad
WebElement dugme = driver.findElement(By.cssSelector(".pagination-button.pagination-older"));
        Actions actions = new Actions(driver);
        actions.moveToElement(dugme);
        Thread.sleep(2000);
        dugme.click();
        ------------------------------------
        Primer kako u praksi na mobilnom telefonu mozete da procitate pozive (slike u threadu), postoji dva nacina, u sustini oba su ista samo zavisi da li pokrene appium aplikaciju ili pokrenete appium preko cmd-a (command prompt, u search na windowsu kucate cmd i izaci ce vam to)
5 replies

Dragoljub Boranijašević  5 days ago
apiwordpresscmd.png 
apiwordpresscmd.png



Dragoljub Boranijašević  5 days ago
apiwordpressappium.png 
apiwordpressappium.png



Dragoljub Boranijašević  5 days ago
U oba slucaja su vam prikazana samo 2 poziva tu

Dragoljub Boranijašević  5 days ago
Vidi se po strelicama kad se salje i prima poziv, uvek se poziv zavrsava status code-om

Dragoljub Boranijašević  5 days ago
Inace to su dva ista poziva samo sto ga telefon prvi put nije nasao i vratio 404, onda je pronasao i vratio 200





Reply…








 */



/* package wejteri;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WejteriUvod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 
		driver.manage().window().maximize();
		driver.navigate().to("https://promenadanovisad.rs/en/");
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		WebDriverWait cekanje = new WebDriverWait(driver, 10);
		WebElement popUpClose = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//*[@id=\"page\"]/div/footer/div[2]/div[2]/span")));
		
		//Thread.sleep(10000);
		//WebElement popUpClose = driver.findElement(By.xpath("//*[@id=\"page\"]/div/footer/div[2]/div[2]/span"));
		popUpClose.click();
		System.out.println("Kraj programa");
	}
} */