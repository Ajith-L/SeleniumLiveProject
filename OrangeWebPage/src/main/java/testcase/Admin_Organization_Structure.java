package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Organization_Structure_Object;

public class Admin_Organization_Structure extends CommonFnction {

	@Test
	public void Structure () {
		PageFactory.initElements(driver, Admin_Organization_Structure_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Organization_Structure_Object.admin);
		actions.moveToElement(Admin_Organization_Structure_Object.Organization);
		actions.moveToElement(Admin_Organization_Structure_Object.Structure);
		actions.click().build().perform();
		
		Admin_Organization_Structure_Object.EditBtn.click();
		Admin_Organization_Structure_Object.DoneBtn.click();
	}
}
