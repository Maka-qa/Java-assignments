package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CreateGalleryPage {
	WebDriver driver;

	WebElement titleInputField;
	WebElement descriptionInputField;
	WebElement imagesInputField;
	
	WebElement submitCreateButton;
	WebElement cancelCreateButton;
	
	By titleInputFieldLocator = By.id("title");
	By descriptionInputFieldLocator = By.id("description");
	By imagesInputFieldLocator = By.cssSelector(".form-control");
	By submitCreateButtonLocator = By.cssSelector(".btn.btn-custom");
	By cancelCreateButtonLocator = By.cssSelector(".btn.btn-custom");
	

	public CreateGalleryPage(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public WebElement getTitleInputField() {
		return driver.findElement(titleInputFieldLocator);
	}



	public WebElement getDescriptionInputField() {
		return driver.findElement(descriptionInputFieldLocator);
	}



	public WebElement getImagesInputField() {
		return driver.findElement(imagesInputFieldLocator);
	}


	public WebElement getSubmitCreateButton() {
		return driver.findElement(submitCreateButtonLocator);
	}
	

	public WebElement getCancelCreateButton() {
		return driver.findElement(cancelCreateButtonLocator);
	}

	


	
	public void submitCreateButtonClick() {
		this.getSubmitCreateButton().click();
	}
	public void cancelCreateButtonClick() {
		this.getCancelCreateButton().click();
	}
	
	public void insertTitle(String title) {
		this.getTitleInputField().sendKeys(title);
	}
	public void insertDescription(String description) {
		this.getDescriptionInputField().sendKeys(description);
	}
	public void insertImages(String images) {
		this.getImagesInputField().clear();
		this.getImagesInputField().sendKeys(images);
	}
	
}



