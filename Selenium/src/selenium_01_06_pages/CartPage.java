package selenium_01_06_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CartPage {
	WebDriver driver;
	WebElement item1ProductName;
	
	public CartPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getItem1ProductName() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
	}
	
	public String textFromitem1ProductName() {
		return this.getItem1ProductName().getText();
	}
}