package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Configuration_Modules_Object;

public class Admin_Configuration_Modules extends CommonFnction {
    @Test
	public void Modules() {
    	PageFactory.initElements(driver, Admin_Configuration_Modules_Object.class);

    	Actions actions = new Actions(driver);
    	actions.moveToElement(Admin_Configuration_Modules_Object.Admin);
    	actions.moveToElement(Admin_Configuration_Modules_Object.Configuration);
    	actions.moveToElement(Admin_Configuration_Modules_Object.Modules);
    	actions.click().build().perform();

	}
}
