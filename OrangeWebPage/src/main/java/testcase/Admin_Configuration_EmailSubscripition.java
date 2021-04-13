package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Configuration_EmailSubscripition_object;

public class Admin_Configuration_EmailSubscripition extends CommonFnction {
	
	@Test
	public void EmailSubscripition() {
		PageFactory.initElements(driver, Admin_Configuration_EmailSubscripition_object.class);

		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Configuration_EmailSubscripition_object.Admin);
		actions.moveToElement(Admin_Configuration_EmailSubscripition_object.Configuration);
		actions.moveToElement(Admin_Configuration_EmailSubscripition_object.EmailSubscripitio);
		actions.click().build().perform();
		
		String ass= Admin_Configuration_EmailSubscripition_object.Test.getText();
		assertEquals(ass, "Leave Applications");
		
	}

}
