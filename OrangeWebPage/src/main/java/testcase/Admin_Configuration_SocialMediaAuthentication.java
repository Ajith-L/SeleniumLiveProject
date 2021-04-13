package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Configuration_SocialMediaAuthentication_Object;

public class Admin_Configuration_SocialMediaAuthentication extends CommonFnction {
   
	@Test
	public void SocialMediaAuthentication() {
		PageFactory.initElements(driver, Admin_Configuration_SocialMediaAuthentication_Object.class);

		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Configuration_SocialMediaAuthentication_Object.Admin);
		actions.moveToElement(Admin_Configuration_SocialMediaAuthentication_Object.Configuration);
		actions.moveToElement(Admin_Configuration_SocialMediaAuthentication_Object.openIdProvider);
		actions.click().build().perform();
	}
}
