package testcase;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;

import testobject.Test_Admin_Usermangement_UserObject;

public class Test_Admin_Usermangement_User extends CommonFnction {

	@Test(priority = 0)

	public void admin() throws IOException {
		
		PageFactory.initElements(driver, Test_Admin_Usermangement_UserObject.class);
		Actions action = new Actions(driver);
		action.moveToElement(Test_Admin_Usermangement_UserObject.Admin);
		action.moveToElement(Test_Admin_Usermangement_UserObject.UserManagement);
		action.moveToElement(Test_Admin_Usermangement_UserObject.Users);
		action.click().build().perform();

	}
 
	@Test(priority = 1)
	public void SystemUser() {
		PageFactory.initElements(driver, Test_Admin_Usermangement_UserObject.class);
		Test_Admin_Usermangement_UserObject.Username.sendKeys("Aatmaram");

		Select select = new Select(Test_Admin_Usermangement_UserObject.UserRole);
		select.selectByIndex(2);

		Test_Admin_Usermangement_UserObject.Employee_Name.sendKeys("Alice Duval");

		Select select1 = new Select(Test_Admin_Usermangement_UserObject.Status);
		select1.selectByIndex(1);

		Test_Admin_Usermangement_UserObject.Search_Btn.click();

		// assertEquals(Test_Admin_Usermangement_UserObject.ast, "Aatmaram");
	}

}
