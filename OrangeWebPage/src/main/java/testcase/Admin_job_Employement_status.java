package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_job_Employement_status_Object;

public class Admin_job_Employement_status extends CommonFnction {

	@Test
	public void Employement_status() {
		PageFactory.initElements(driver, Admin_job_Employement_status_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_job_Employement_status_Object.Admin);
		actions.moveToElement(Admin_job_Employement_status_Object.Job);
		actions.moveToElement(Admin_job_Employement_status_Object.Employement_Status);
		actions.click().build().perform();
		
		Admin_job_Employement_status_Object.AddBtn.click();
		Admin_job_Employement_status_Object.Value.sendKeys("appahci");
		Admin_job_Employement_status_Object.SaveBtn.click();
		
	}

}
