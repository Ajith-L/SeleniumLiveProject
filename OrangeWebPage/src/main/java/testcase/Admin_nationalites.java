package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_nationalites_Object;

public class Admin_nationalites extends CommonFnction {

	@Test
	public void nationalites() {
		PageFactory.initElements(driver, Admin_nationalites_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_nationalites_Object.Admin);
		actions.moveToElement(Admin_nationalites_Object.nationalites);
		actions.click().build().perform();
		
		Admin_nationalites_Object.AddBtn.click();
		 Admin_nationalites_Object.Name.sendKeys("India");
		 String print= Admin_nationalites_Object.ast.getText();
		 assertEquals(print, "Already exists");//save only its run correctly..
		

	}

}
