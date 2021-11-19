package selenium_01_06_tests;

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
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}