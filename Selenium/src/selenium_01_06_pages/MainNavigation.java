package selenium_01_06_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class MainNavigation {
	WebDriver driver;
	WebElement myAccountTab;
	
	public MainNavigation(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getMyAccountTab() {
		return driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[3]/a"));
	}
	
	public void myAccountTabClick() {
		this.getMyAccountTab().click();
	}
}