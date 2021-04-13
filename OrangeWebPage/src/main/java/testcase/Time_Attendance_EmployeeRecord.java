package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Time_Attendance_EmployeeRecord_Object;

public class Time_Attendance_EmployeeRecord extends CommonFnction {
	@Test
	public void EmployeeRecord() {
		PageFactory.initElements(driver,Time_Attendance_EmployeeRecord_Object.class) ;
		Actions actions = new Actions(driver);
		actions.moveToElement(Time_Attendance_EmployeeRecord_Object.Time);
		actions.moveToElement(Time_Attendance_EmployeeRecord_Object.Attendance);
		actions.moveToElement(Time_Attendance_EmployeeRecord_Object.AttendanceRecord);
		actions.click().build().perform();
    
		Time_Attendance_EmployeeRecord_Object.EmpName.sendKeys("Peter Mac Anderson");
		Time_Attendance_EmployeeRecord_Object.Date.clear();
		Time_Attendance_EmployeeRecord_Object.Date.sendKeys("2020-01-02");
		Time_Attendance_EmployeeRecord_Object.ViewBtn.click();
		
		
		String txt= Time_Attendance_EmployeeRecord_Object.test.getText();
	    assertEquals(txt, "No attendance records to display");
}
}