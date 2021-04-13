package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Configuration_LanguagePackages_Object;

public class Admin_Configuration_LanguagePackages  extends CommonFnction{

	@Test
	public void LanguagePackages() {
	PageFactory.initElements(driver, Admin_Configuration_LanguagePackages_Object.class);

	Actions actions = new Actions(driver);
	actions.moveToElement(Admin_Configuration_LanguagePackages_Object.Admin);
	actions.moveToElement(Admin_Configuration_LanguagePackages_Object.Configuration);
	actions.moveToElement(Admin_Configuration_LanguagePackages_Object.languagePackage);
	actions.click().build().perform();
	
	}
}
