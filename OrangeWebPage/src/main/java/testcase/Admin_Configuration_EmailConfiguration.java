package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Configuration_EmailConfiguration_Object;

public class Admin_Configuration_EmailConfiguration extends CommonFnction {
	
@Test
 public void EmailConfiguration() {
	 PageFactory.initElements(driver, Admin_Configuration_EmailConfiguration_Object.class);
	
	 Actions actions = new Actions(driver);		 
	 actions.moveToElement(Admin_Configuration_EmailConfiguration_Object.Admin);
	 actions.moveToElement(Admin_Configuration_EmailConfiguration_Object.Configuration);
	 actions.moveToElement(Admin_Configuration_EmailConfiguration_Object.MailConfiguration);
	 actions.click().build().perform();
	 
	 String assert1= Admin_Configuration_EmailConfiguration_Object.Test.getText();
	 assertEquals(assert1,"info@orangehrm.com");

 }
}
