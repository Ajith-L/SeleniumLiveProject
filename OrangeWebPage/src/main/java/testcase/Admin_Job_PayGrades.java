package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Job_PayGrades_Object;

public class Admin_Job_PayGrades extends CommonFnction{

	@Test
	public void Paygrade() {
		PageFactory.initElements(driver, Admin_Job_PayGrades_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Job_PayGrades_Object.Admin);
		actions.moveToElement(Admin_Job_PayGrades_Object.Job);
		actions.moveToElement(Admin_Job_PayGrades_Object.Pay_Grade);
		actions.click().build().perform();
		
		Admin_Job_PayGrades_Object.Tick.click();
	}
}