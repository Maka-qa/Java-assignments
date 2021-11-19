package primer1_pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CartPage {
	WebDriver driver;
	
	WebElement item1ProductName;
	WebElement item2ProductName;
	WebElement item3ProductName;

	WebElement removeItem1;
	WebElement emptyCartLabel;
	WebElement totalPriceForItem;
	WebElement totalItemAdded;
	
	/* milana primer
	WebElement whatsInCart;
	WebElement quantity;
	WebElement cartSubtotal;
	
	*/
	public CartPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	/*
	public WebElement getWhatsInCart() {
		return  driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
	}
	public String whatsInCart() {
		return this.getWhatsInCart().getText();
	}
	

	public WebElement getQuantity() {
		return driver.findElement(By.id("quantity_60b68ffc41f86"));
	}
	public void insertQuantity(String quantity) {
		this.getQuantity().clear();
		this.getQuantity().sendKeys(quantity);
	}
	
	public WebElement getCartSubtotal() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/div[2]/div[2]/table/tbody/tr[1]/td/span"));
	}
	public String cartSubtotalMoney() {
		return this.getCartSubtotal().getText();
	}

*/
	public WebElement getItem1ProductName() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
	}
	
	public WebElement getItem2ProductName() {
		return driver.findElement(By.xpath("//*[@id=\"product-66\"]/div[2]/h1"));
	}

	public WebElement getItem3ProductName() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]"));
	}

	public WebElement getRemoveItem1() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[1]/a"));
	}
	public WebElement getEmptyCartLabel() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/div/p"));
	}
	public WebElement getTotalPriceForItem() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[6]/span"));
	}
	public WebElement getTotalItemAdded() {
		return totalItemAdded;
	}

	public String textFromitem1ProductName() {
		return this.getItem1ProductName().getText();
	}
	public String textFromitem2ProductName() {
		return this.getItem2ProductName().getText();
	}
	public String textFromitem3ProductName() {
		return this.getItem3ProductName().getText();
	}
	public void removeItem1ButtonClick() {
		this.getRemoveItem1().click();
	}
	public String textFromEmptyCartLabel() {
		return this.getEmptyCartLabel().getText();
	}
	public String textFromTotalPriceForItem() {
		return this.getTotalPriceForItem().getText();
	}
	public List<WebElement> getCartItemsList() {
		return driver.findElements(By.className("cart_item"));
	}
	public String numberAddedItems() {
		return totalItemAdded.getText();
	}
}