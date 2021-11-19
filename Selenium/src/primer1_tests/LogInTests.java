package primer1_tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LogInTests extends BaseTests{
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to("http://cms.demo.katalon.com/");
		driver.manage().window().maximize();
	}
	/*@Test(priority = 0)
	public void logInValidCredentials() throws InterruptedException {
		
		logInFormFilling("customer", "123456789");
		
		String actualText = myAccountPage.textFromLogOutButton();
		
		assertEquals(actualText, "Log out");
	}*/
	
	@Test(priority = 0)
	public void logInValidCredentials() throws InterruptedException {
		String username = citacIzExcela.getStringData("LogInTests", 4, 2);
		//String password = citacIzExcela.getStringData("LogInTests", 5, 2);
		String textForAssertion = citacIzExcela.getStringData("LogInTests", 9, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("LogInTests", 5, 2));
		logInFormFilling(username, password);
		String actualText = myAccountPage.textFromLogOutButton();
		assertEquals(actualText, textForAssertion);
	}
	/*@Test(priority = 5)
	public void logInWrongCredentials() throws InterruptedException {
		
		logInFormFilling("customer1", "1234567891");
		
		String actualText = myAccountPage.textWrongUsernameLabel();
		
		assertEquals(actualText, "ERROR: Invalid username. Lost your password?");
	}*/
	
	@Test(priority = 5)
	public void logInWrongCredentials() throws InterruptedException {
		String username = citacIzExcela.getStringData("LogInTests", 4, 3);
		//String password = citacIzExcela.getStringData("LogInTests", 5, 2);
		String textForAssertion = citacIzExcela.getStringData("LogInTests", 9, 3);
		String password = String.valueOf(citacIzExcela.getIntegerData("LogInTests", 5, 3));
		logInFormFilling(username, password);
		String actualText = myAccountPage.textWrongUsernameLabel();
		assertEquals(actualText, textForAssertion);
	}
	/*@Test(priority = 10)
	public void logInEmptyCredentials() throws InterruptedException {
		
		logInFormFilling("", "");
		
		String actualText = myAccountPage.textWrongUsernameLabel();
		
		assertEquals(actualText, "Error: Username is required.");
	}*/
	
	@Test(priority = 10)
	public void logInEmptyCredentials() throws InterruptedException {
		String textForAssertion = citacIzExcela.getStringData("LogInTests", 9, 4);
		logInFormFilling("", "");
		String actualText = myAccountPage.textWrongUsernameLabel();
		assertEquals(actualText, textForAssertion);
	}
	/*@Test(priority = 15)
	public void logOut() throws InterruptedException {
		
		logInValidCredentials();
		
		myAccountPage.logOutButtonClick();
		
		String actualText = myAccountPage.textFromLogInButton();
		
		assertEquals(actualText, "LOG IN");
	}*/
	
	@Test(priority = 15)
	public void logOut() throws InterruptedException {
		String textForAssertion = citacIzExcela.getStringData("LogInTests", 7, 2);
		logInValidCredentials();
		myAccountPage.logOutButtonClick();
		String actualText = myAccountPage.textFromLogInButton();
		assertEquals(actualText, textForAssertion);
	}
	
	public void logInFormFilling(String username, String password) {
		
		mainNavigation.myAccountTabClick();
		myAccountPage.insertUsername(username);
		myAccountPage.insertPassword(password);
		myAccountPage.rememberMeCheckBoxCheck();
		myAccountPage.logInButtonClick();
	}
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}

/*
//  PRIMER1
import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTests extends BaseTests {
	
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to("http://cms.demo.katalon.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 0)
	public void loginValidCredentials() throws InterruptedException {
		mainNavigation.myAccountTabClick();
		
		//  fill form
		myAccountPage.insertUsername("customer");
		myAccountPage.insertPassword("123456789");
		myAccountPage.rememberMeCheckBoxCheck();
		myAccountPage.logInButtonClick();
		
		
		String actualText = myAccountPage.textFromLogOutButton();
		
		assertEquals(actualText, "Log out");	
	}

	@AfterMethod
	public void posleSvakogTesta() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
}
}

----------------------------------------------

DJOLE PRIMER
package testsCas6;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LogInTests extends BaseTests{
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to("http://cms.demo.katalon.com/");
		driver.manage().window().maximize();
	
	}
	@Test(priority = 0)
	public void logInValidCredentials() throws InterruptedException {
		mainNavigation.myAccountTabClick();
		myAccountPage.insertUsername("customer");
		myAccountPage.insertPassword("123456789");
		myAccountPage.rememberMeCheckBoxCheck();
		myAccountPage.logInButtonClick();
		String actualText = myAccountPage.textFromLogOutButton();
		assertEquals(actualText, "Log out");
	}
	@Test(priority=5)
	public void logovanjeBezKredencijala(){
		mainNavigation.myAccountTabClick();
		myAccountPage.insertUsername("");
		myAccountPage.insertPassword("");
		myAccountPage.rememberMeCheckBoxCheck();
		myAccountPage.logInButtonClick();
		String errorMessage=myAccountPage.textAfterCredencials();
		assertEquals(errorMessage, "Error: Username is required.");
	}
	@Test(priority=10)
	public void logovanjeSaInvalidnimKredencijalima(){
		mainNavigation.myAccountTabClick();
		myAccountPage.insertUsername("dsadasf1");
		myAccountPage.insertPassword("e2144212");
		myAccountPage.rememberMeCheckBoxCheck();
		myAccountPage.logInButtonClick();
		String errorMessage=myAccountPage.textAfterCredencials();
		assertEquals(errorMessage, "ERROR: Invalid username. Lost your password?");
	}
	@Test(priority=15)
	public void logOut(){
		mainNavigation.myAccountTabClick();
		myAccountPage.insertUsername("customer");
		myAccountPage.insertPassword("123456789");
		myAccountPage.rememberMeCheckBoxCheck();
		myAccountPage.logInButtonClick();
		myAccountPage.getLogOutButton();
		String actualText = myAccountPage.textFromLogInButton();
		assertEquals(actualText, "LOG IN");
	}
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
*/