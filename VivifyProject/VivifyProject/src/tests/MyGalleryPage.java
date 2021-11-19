package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyGalleryPage extends BaseTests{

	@BeforeMethod
	public void beforeTest() {

		
	}

	@Test (priority = 0)
	public void logInValidCredentials() {
		allGalleriesPages.myGalleriesNavigationButtonClick();;

		String createGallerySheetName = null;
		myGalleriesPage.searchFieldInput(excelReader.getStringData(myGalleriesSheetName, 7, 2));
		myGalleriesPage.clickOnFilterButton();
		
	}




	@AfterMethod
	public void afterTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}



}
