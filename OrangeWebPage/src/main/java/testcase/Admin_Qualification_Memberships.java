package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Qualification_Memberships_Object;

public class Admin_Qualification_Memberships extends CommonFnction{
	
	@Test
	public void Memberships() {
		PageFactory.initElements(driver, Admin_Qualification_Memberships_Object.class) ;
		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Qualification_Memberships_Object.admin);
		actions.moveToElement(Admin_Qualification_Memberships_Object.Qualifications);
		actions.moveToElement(Admin_Qualification_Memberships_Object.membership);
		actions.click().build().perform();
		
		boolean print= Admin_Qualification_Memberships_Object.membership.isSelected();
		assertEquals(print, false);
	
	}

}
