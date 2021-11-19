package primer1_pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ShopPage {
	WebDriver driver;
	
	WebElement addFlyingNinjaToCartButton;
	WebElement addhappyNinjaToCardButton;
	WebElement addpatientNinjaToCardButton;
	
	WebElement flyingNinjaViewCartButton;
	WebElement happyNinjaViewCartButton;
	WebElement patientNinjaViewCartButton;
	
	public ShopPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getAddFlyingNinjaToCartButton() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[2]"));
	}
	public WebElement getflyingNinjaViewCartButton() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[3]"));
	}
	public WebElement getHappyNinjaAddToCardButton() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[3]/div/a[2]"));
	}
	public WebElement getPatientNinjaAddToCardButton() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[6]/div/a[2]"));
	}
	
	public void addFlyingNinjaToCartButtonClick() {
		this.getAddFlyingNinjaToCartButton().click();
	}
	public void flyingNinjaViewCartButtonClick() {
		this.getflyingNinjaViewCartButton().click();
	}
	public void addHappyNinjaToCartButtonClick() {
		this.getHappyNinjaAddToCardButton().click();
	}
	public void happyNinjaViewCartButtonClick() {
		this.getflyingNinjaViewCartButton().click();
	}
	public void addPatientToCartButtonClick() {
		this.getPatientNinjaAddToCardButton().click();
	}
	public void patientNinjaViewCartButtonClick() {
		this.getflyingNinjaViewCartButton().click();
	}
		
	}
	
