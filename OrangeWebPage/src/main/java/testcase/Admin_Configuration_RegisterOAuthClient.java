package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Configuration_RegisterOAuthClient_Object;

public class Admin_Configuration_RegisterOAuthClient extends CommonFnction {
  
	@Test
	public void RegisterOAuthClient() {
		PageFactory.initElements(driver, Admin_Configuration_RegisterOAuthClient_Object.class);

		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Configuration_RegisterOAuthClient_Object.Admin);
		actions.moveToElement(Admin_Configuration_RegisterOAuthClient_Object.Configuration);
		actions.moveToElement(Admin_Configuration_RegisterOAuthClient_Object.registerOAuthClient);
		actions.click().build().perform();
	}

}
