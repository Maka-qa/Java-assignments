package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllGalleriesPages {
	WebDriver driver;

	WebElement logInNavigationButton;
	WebElement loginEmailField;
	WebElement loginPasswordField;
	WebElement submitButton;
	WebElement loginErrorMessage;
	WebElement searchFieldInput;
	WebElement filterButton;
	WebElement myGalleriesNavigationButton;
	WebElement createGalleryNavigationButton;


	By logInNavigationButtonLocator = By.cssSelector(".nav-link.nav-buttons");
	By loginEmailFieldLocator = By.id("email");
	By loginPasswordFieldLocator = By.id("password");
	By submitButtonLocator = By.cssSelector(".btn.btn-custom");
	By loginErrorMessageLocator = By.cssSelector(".alert.alert-danger");
	By searchFieldInputLocator = By.className("form-control");
	By filterButtonLocator = By.cssSelector(".btn.btn-outline-secondary.input-button");
	By myGalleriesNavigationButtonLocator = By.cssSelector(".nav-link.nav-buttons.router-link-exact-active.router-link-active");
	By createGalleryNavigationButtonLocator = By.cssSelector(".nav-link.nav-buttons");

	public AllGalleriesPages(WebDriver driver) {
		super();
		this.driver = driver;
	}

	// Log in getters
	public WebElement getLogInNavigationButton() {
		return driver.findElement(logInNavigationButtonLocator);
	}

	public WebElement getLoginEmailField() {
		return driver.findElement(loginEmailFieldLocator);
	}

	public WebElement getLoginPasswordField() {
		return driver.findElement(loginPasswordFieldLocator);
	}

	public WebElement getSubmitButton() {
		return driver.findElement(submitButtonLocator);
	}

	public WebElement getLoginErrorMessage() {
		return driver.findElement(loginErrorMessageLocator);
	}
	public WebElement getMyGalleriesNavigationButton() {
		return driver.findElement(myGalleriesNavigationButtonLocator);
	}
	public WebElement getCreateGalleryNavigationButton() {
		return driver.findElement(createGalleryNavigationButtonLocator);
	}

	// Search getters
	public WebElement getSearchFieldInput() {
		return driver.findElement(searchFieldInputLocator);
	}
	public WebElement getFilterButton() {
		return driver.findElement(filterButtonLocator);
	}

	// Log in tests methods

	public void logInNavigationButtonClick() {
		this.getLogInNavigationButton().click();
	}

	public void fillLoginEmailField(String email) {
		getLoginEmailField().sendKeys(email);
	}

	public void fillLoginPasswordField(String password) {
		getLoginPasswordField().sendKeys(password);
	}

	public void clickOnSubmitButton() {
		getSubmitButton().click();
	}

	public boolean visibilityOfLoginErrorMessage() {
		if (getLoginErrorMessage().isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	public void myGalleriesNavigationButtonClick() {
		this.getMyGalleriesNavigationButton().click();
	}
	public void createGalleryNavigationButtonClick() {
		this.getCreateGalleryNavigationButton().click();
	}
	public String getLoginErrorMessageText() {
		return getLoginErrorMessage().getText();
	}

	public void clearLoginInputFields() {
		getLoginEmailField().clear();
		getLoginPasswordField().clear();
	}

	public String getLoginPasswordFieldText() {
		return getLoginPasswordField().getText();
	}

	public void searchFieldInput(String searchInput) {
		this.getSearchFieldInput().sendKeys(searchInput);
	}

}
