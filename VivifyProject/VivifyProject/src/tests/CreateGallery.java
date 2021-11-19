package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateGallery extends BaseTests{
	
	@BeforeMethod
	public void beforeTest() {

		
	}

	@Test (priority = 0)
	public void logInValidCredentials() {
		allGalleriesPages.createGalleryNavigationButtonClick();;

		String createGallerySheetName = null;
		createGalleryPage.insertTitle(excelReader.getStringData(createGallerySheetName, 7, 2));
		createGalleryPage.insertDescription(excelReader.getStringData(createGallerySheetName, 8, 2));;
		createGalleryPage.insertImages(excelReader.getStringData(createGallerySheetName, 9, 2));;
		createGalleryPage.submitCreateButtonClick();
	}




	@AfterMethod
	public void afterTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}




}
