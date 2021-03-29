package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Job_JobCategory_Object;

public class Admin_Job_JobCategory extends CommonFnction {

	@Test
	public void jobCategory() {
		 PageFactory.initElements(driver, Admin_Job_JobCategory_Object.class);
	Actions actions = new Actions(driver);
	actions.moveToElement(Admin_Job_JobCategory_Object.Admin);
	actions.moveToElement(Admin_Job_JobCategory_Object.Job);
	actions.moveToElement(Admin_Job_JobCategory_Object.jobCategor);
	actions.click().build().perform();
	
	assertEquals(Admin_Job_JobCategory_Object.txt.getText(), "Laborers and Helpers");	
	}
}
