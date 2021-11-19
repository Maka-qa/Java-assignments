package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyGalleriesPage {

	WebDriver driver;
	
	WebElement searchFieldInput;
	WebElement filterButton;

	By searchFieldInputLocator = By.className("form-control");
	By filterButtonLocator = By.cssSelector(".btn.btn-outline-secondary.input-button");

	
	public MyGalleriesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	// Search getters
		public WebElement getSearchFieldInput() {
			return driver.findElement(searchFieldInputLocator);
		}
		public WebElement getFilterButton() {
			return driver.findElement(filterButtonLocator);
		}
		
	// Methods
		public void searchFieldInput(String searchInput) {
			this.getSearchFieldInput().sendKeys(searchInput);
		}
		
		public void clickOnFilterButton() {
			getFilterButton().click();
		}

	
}
