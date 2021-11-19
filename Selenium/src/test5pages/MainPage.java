package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	
	WebDriver driver;
	WebElement usernameInputField;
	WebElement passwordInputField;
	WebElement logInButton;
	

	
	
	public MainPage(WebDriver driver) {
		super();
		this.driver = driver;
		
}



	public WebElement getUsernameInputField() {
		return driver.findElement(By.id("user-name"));
	}
	public WebElement getPasswordInputField() {
		return driver.findElement(By.id("password"));
	}
	public WebElement getLogInButton() {
		return driver.findElement(By.id("login-button"));
	}

	public void insertUsername(String username) {
		this.getPasswordInputField().clear();
		this.getUsernameInputField().sendKeys(username);
	}
	public void insertPassword(String password) {
		this.getPasswordInputField().clear();
		this.getPasswordInputField().sendKeys(password);
	}
	public void logInButtonClick() {
		this.getLogInButton().click();
	}



	}


	
	

