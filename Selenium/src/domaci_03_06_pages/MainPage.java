package domaci_03_06_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	
public	WebDriver driver1;
	
	WebElement logInButton1;
	WebElement usernameInputField;
	WebElement continueButton;
	WebElement passwordInputField;
	WebElement logInButton2;

	WebElement profileButton;
 	WebElement logOutButton;
	WebElement wrongUsernameLabel;
	WebElement wrongPasswordLabel;

	
	
	public MainPage(WebDriver driver) {
		super();
		this.driver1 = driver;
	}



	public WebElement getLogInButton1() {
		return driver1.findElement(By.cssSelector(".x-nav-item.x-nav-item--wide"));
	}



	public WebElement getUsernameInputField() {
		return driver1.findElement(By.id("usernameOrEmail"));
	}



	public WebElement getContinueButton() {
		return driver1.findElement(By.cssSelector(".button.form-button.is-primary"));
	}



	public WebElement getPasswordInputField() {
		return driver1.findElement(By.id("password"));
	}


	public WebElement getLogInButton2() {
		return driver1.findElement(By.cssSelector(".login__form-action"));
	}



	public WebElement getProfileButton() {
		return driver1.findElement(By.cssSelector(".gravatar"));
	}



	public WebElement getLogOutButton() {
		return driver1.findElement(By.cssSelector(".button sidebar.me-signout-button.is-compact"));
	}



	public WebElement getWrongUsernameLabel() {
		return driver1.findElement(By.cssSelector("form-input-validation.is-error"));
	}



	public WebElement getWrongPasswordLabel() {
		return driver1.findElement(By.cssSelector(".form-input-validation.is-error"));
	}
	
	public void logInButton1Click() {
		this.getLogInButton1().click();
	}
	public void insertUsername(String username) {
		this.getPasswordInputField().clear();
		this.getUsernameInputField().sendKeys(username);
	}
	public void continueButtonClick() {
		this.getContinueButton().click();
	}
	public void insertPassword(String password) {
		this.getPasswordInputField().clear();
			this.getPasswordInputField().sendKeys(password);
	}
	public void logInButton2Click() {
		this.getLogInButton2().click();
	}
	
	public void profileButtonClick() {
		this.getProfileButton().click();
	}
	
	public void logOutButtonClick() {
		this.getLogOutButton().click();
	}
	public String textFromLogOutButton() {
		return this.getLogOutButton().getText();
	}
	public String textWrongUsernameLabel() {
		return this.getWrongUsernameLabel().getText();
	}
	public String textWrongPasswordLabel() {
		return this.getWrongPasswordLabel().getText();
	}
}