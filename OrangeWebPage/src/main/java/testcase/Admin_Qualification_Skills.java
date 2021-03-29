package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Qualification_Skills_Object;

public class Admin_Qualification_Skills extends CommonFnction {
	@Test
	public void  Skills() {
		PageFactory.initElements(driver, Admin_Qualification_Skills_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Qualification_Skills_Object.admin);
		actions.moveToElement(Admin_Qualification_Skills_Object.Qualifications);
		actions.moveToElement(Admin_Qualification_Skills_Object.Skils);
		actions.click().build().perform();
	}

}
