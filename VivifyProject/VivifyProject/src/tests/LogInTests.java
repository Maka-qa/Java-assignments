package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTests extends BaseTests{





@BeforeMethod
public void beforeTest() {

	
}

@Test (priority = 0)
public void logInValidCredentials() {
	allGalleriesPages.logInNavigationButtonClick();

	allGalleriesPages.fillLoginEmailField(excelReader.getStringData(logInSheetName, 7, 2));
	allGalleriesPages.fillLoginPasswordField(excelReader.getStringData(logInSheetName, 8, 2));
	allGalleriesPages.clickOnSubmitButton();

	
}




@AfterMethod
public void afterTest() {
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
}


}