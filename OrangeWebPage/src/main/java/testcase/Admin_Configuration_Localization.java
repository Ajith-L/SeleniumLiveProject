package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Configuration_Localization_Object;

public class Admin_Configuration_Localization extends CommonFnction {

	@Test
	public void  Localization() {
		
		PageFactory.initElements(driver, Admin_Configuration_Localization_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Configuration_Localization_Object.Admin);
		actions.moveToElement(Admin_Configuration_Localization_Object.Configuration);
		actions.moveToElement(Admin_Configuration_Localization_Object.localization);
		actions.click().build().perform();

	}
}
