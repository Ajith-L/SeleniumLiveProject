package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import commonFunction.CommonFnction;
import testobject.Admin_Job_WorkShift_Object;

public class Admin_Job_WorkShift extends CommonFnction {
    
	@Test
	public void WorkShift() {
		PageFactory.initElements(driver, Admin_Job_WorkShift_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Job_WorkShift_Object.Admin);
		actions.moveToElement(Admin_Job_WorkShift_Object.Job);
		actions.moveToElement(Admin_Job_WorkShift_Object.WorkShift);
		actions.click().build().perform();
		
		String data= Admin_Job_WorkShift_Object.ast.getText();
	assertEquals(data,"General");
		//System.out.println(data);
	}
	
}
