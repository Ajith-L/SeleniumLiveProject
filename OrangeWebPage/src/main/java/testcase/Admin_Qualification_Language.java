package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Qualification_Langage_Object;

public class Admin_Qualification_Language extends CommonFnction {

	@Test
	public void Language() {
	 PageFactory.initElements(driver, Admin_Qualification_Langage_Object.class);
	 
	 Actions actions = new  Actions(driver);
	 actions.moveToElement(Admin_Qualification_Langage_Object.admin);
	 actions.moveToElement(Admin_Qualification_Langage_Object.Qualifications);
	 actions.moveToElement(Admin_Qualification_Langage_Object.Languages);
	 actions.click().build().perform();
	 
	String print = Admin_Qualification_Langage_Object.msg.getText();
	assertEquals(print,"Arabic");
	 
 }
	  
}
