package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Time_Attendance_Myrecord_Object;

public class Time_Attendance_Myrecord extends CommonFnction {
	@Test
		public void Myrecord() {
		PageFactory.initElements(driver,Time_Attendance_Myrecord_Object.class) ;
		Actions actions = new Actions(driver);
		actions.moveToElement(Time_Attendance_Myrecord_Object.Time);
		actions.moveToElement(Time_Attendance_Myrecord_Object.Attendance);
		actions.moveToElement(Time_Attendance_Myrecord_Object.MyRecord);
		actions.click().build().perform();
		
		Time_Attendance_Myrecord_Object.Date.clear();
		Time_Attendance_Myrecord_Object.Date.sendKeys("2020-02-01");
		actions.click().build().perform();
		
		String ast= Time_Attendance_Myrecord_Object.Test.getText();
		assertEquals(ast,"No attendance records to display");
		}
	  
}
