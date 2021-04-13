package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Time_Timesheets_EmployeeTimesheet_Object;

public class Time_Timesheets_EmployeeTimesheet extends CommonFnction {
	@Test
	public void EmployeeTimesheet() {
		PageFactory.initElements(driver, Time_Timesheets_EmployeeTimesheet_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Time_Timesheets_EmployeeTimesheet_Object.Time);
		actions.moveToElement(Time_Timesheets_EmployeeTimesheet_Object.Timesheets);
		actions.moveToElement(Time_Timesheets_EmployeeTimesheet_Object.EmployeeTimeSheet);
		actions.click().build().perform();
		 
		Time_Timesheets_EmployeeTimesheet_Object.EmployeeName.clear();
		Time_Timesheets_EmployeeTimesheet_Object.EmployeeName.sendKeys("Melan Peiris");
		Time_Timesheets_EmployeeTimesheet_Object.viewbtn.click();
		String ast= Time_Timesheets_EmployeeTimesheet_Object.Test.getText();
		assertEquals(ast, "No Timesheets Found");

	}
}
