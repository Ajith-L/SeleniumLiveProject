package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Time_Attendance_Configration_Object;

public class Time_Attendance_Configration extends CommonFnction {

	@Test
	public void Configration () {
	PageFactory.initElements(driver,Time_Attendance_Configration_Object.class) ;
	Actions actions = new Actions(driver);
	actions.moveToElement(Time_Attendance_Configration_Object.Time);
	actions.moveToElement(Time_Attendance_Configration_Object.Attendance);
	actions.moveToElement(Time_Attendance_Configration_Object.Configration);
	actions.click().build().perform();
	
	
	boolean actual= Time_Attendance_Configration_Object.Test.isDisplayed();
	assertEquals(actual, true);
	
	
	}
}
