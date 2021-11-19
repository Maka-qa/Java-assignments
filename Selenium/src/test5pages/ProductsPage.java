package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
	
	WebDriver driver;
	WebElement addSauceLabsBackpack;
	WebElement addSauceLabsBikeLight;
	WebElement addSauceLabsBoltTShirt;
	
	WebElement shoppingCartLink;
	/*WebElement menuButton;
	WebElement logOutButtonInMenu;*/
	
	public ProductsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getAddSauceLabsBackpack() {
		return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	}
	
	public WebElement getAddSauceLabsBikeLight() {
		return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
	}
	public WebElement getAddSauceLabsBoltTShirt() {
		return driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
	}
	
	public WebElement getShoppingCartLink() {
		return driver.findElement(By.className("shopping_cart_link"));
	}
	
	/*public WebElement getMenuButton() {
		return driver.findElement(By.id("react-burger-menu-btn"));
	}
	public WebElement getLogOutButtonInMenu() {
		return driver.findElement(By.id("logout_sidebar_link"));
	}*/
	
	
	public void addSauceLabsBackpackClick() {
		this.getAddSauceLabsBackpack().click();
	}
	public void addSauceLabsBikeLightClick() {
		this.getAddSauceLabsBikeLight().click();
	}
	public void addSauceLabsBoltTShirtClick() {
		this.getAddSauceLabsBoltTShirt().click();
	}
	
	public String shoppingCartLinkClick() {
		return getShoppingCartLink().getText();
		
	}
	/*public void menuButtonClick() {
		this.getMenuButton().click();
	
	}
	public String logOutButtonInMenu() {
		return this.getLogOutButtonInMenu().getText();
		
	}*/
}
