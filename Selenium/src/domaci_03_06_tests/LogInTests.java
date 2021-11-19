package domaci_03_06_tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import domaci_03_06_base.BaseTests1;
import domaci_03_06_pages.MainPage;


public class LogInTests extends BaseTests1{
	@BeforeMethod
	public void preSvakogTesta() {
		
		driver1.navigate().to("https://wordpress.com/");
		driver1.manage().window().maximize();
	}
	
	@Test(priority = 0)
	public void logInValidCredentials() {
		String username = citacExcela.getStringData("LogInTests", 4, 2);
		String password = citacExcela.getStringData("LogInTests", 6, 2);
		String textForAssertion = citacExcela.getStringData("LogInTests", 10, 2);
		logInFormFilling(username, password);
		String actualText1 = mainPage.textFromLogOutButton();
		assertEquals(actualText1, textForAssertion);
		/*String actualText = mainPage.textFromLogOutButton();
		assertEquals(actualText, textForAssertion);*/

}
	@Test(priority = 5)
	public void logInWrongEmail() {
		String username = citacExcela.getStringData("LogInTests", 4, 3);
		String password = citacExcela.getStringData("LogInTests", 6, 2);
		String textForAssertion = citacExcela.getStringData("LogInTests", 10, 3);
		logInFormFilling(username, password);
		String actualText = mainPage.textWrongUsernameLabel();
		assertEquals(actualText, textForAssertion);
	}
	
	@Test(priority = 5)
	public void logInWrongPassword() {
		String username = citacExcela.getStringData("LogInTests", 4, 4);
		String password = citacExcela.getStringData("LogInTests", 6, 4);
		String textForAssertion = citacExcela.getStringData("LogInTests", 10, 4);
		logInFormFilling(username, password);
		String actualText = mainPage.textWrongPasswordLabel();
		assertEquals(actualText, textForAssertion);
	}
	
	
public void logInFormFilling(String username, String password) {
		
		mainPage.logInButton1Click();
		mainPage.insertUsername(username);
		mainPage.continueButtonClick();
		mainPage.insertPassword(password);
		mainPage.logInButton2Click();
	}

@AfterMethod
public void posleSvakogTesta() throws InterruptedException {		
	driver1.manage().deleteAllCookies();
	driver1.navigate().refresh();
}
}