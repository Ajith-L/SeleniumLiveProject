package testcase;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Job_JobTitles_Object;

public class Admin_Job_JobTitles extends CommonFnction {

	public void jobtitles() throws IOException {

		PageFactory.initElements(driver, Admin_Job_JobTitles_Object.class);

		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Job_JobTitles_Object.Admin);
		actions.moveToElement(Admin_Job_JobTitles_Object.Job);
		actions.moveToElement(Admin_Job_JobTitles_Object.JobTitles);
		actions.click().build().perform();

	}

	@Test
	public void addbtn() throws IOException {
		jobtitles();
		Admin_Job_JobTitles_Object.Add_btn.click();
		// Admin_Job_JobTitles_Object.Job_Title_Name.sendKeys("selenium");
		Admin_Job_JobTitles_Object.Save_Btn.click();

	}

}
