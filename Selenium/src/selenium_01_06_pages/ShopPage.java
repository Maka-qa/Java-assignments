package selenium_01_06_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ShopPage {
	WebDriver driver;
	WebElement addFlyingNinjaToCartButton;
	WebElement flyingNinjaViewCartButton;
	
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
	
	public void addFlyingNinjaToCartButtonClick() {
		this.getAddFlyingNinjaToCartButton().click();
	}
	public void flyingNinjaViewCartButtonClick() {
		this.getflyingNinjaViewCartButton().click();
	}
}