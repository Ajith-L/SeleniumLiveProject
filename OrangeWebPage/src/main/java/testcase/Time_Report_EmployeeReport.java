package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Time_Report_EmployeeReport_Object;

public class Time_Report_EmployeeReport  extends CommonFnction {

	@Test 
	public void EmployeeReport(){
		PageFactory.initElements(driver,Time_Report_EmployeeReport_Object.class) ;
		Actions actions = new Actions(driver);
			actions.moveToElement(Time_Report_EmployeeReport_Object.Time);
			actions.moveToElement(Time_Report_EmployeeReport_Object.Reports);
			actions.moveToElement(Time_Report_EmployeeReport_Object.EmployeeReport);
			actions.click().build().perform();
		
			
			Time_Report_EmployeeReport_Object.EmployeeName.clear();
			boolean actual= Time_Report_EmployeeReport_Object.EmployeeName.equals(null);
			assertEquals(actual, false);
			Time_Report_EmployeeReport_Object.EmployeeName.sendKeys("Peter Mac Anderson");
			
	}

}
