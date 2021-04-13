package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Time_Attendance_PunchInOut_Object;

public class Time_Attendance_PunchInOut extends CommonFnction {

	@Test
	public void PunchInOut() {
		PageFactory.initElements(driver, Time_Attendance_PunchInOut_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Time_Attendance_PunchInOut_Object.Time);
		actions.moveToElement(Time_Attendance_PunchInOut_Object.Attendance);
		actions.moveToElement(Time_Attendance_PunchInOut_Object.PunchInOut);
		actions.click().build().perform();
		
		Time_Attendance_PunchInOut_Object.PunchIn.click();
		Time_Attendance_PunchInOut_Object.PunchInOut.click();
		
		//String autal= Time_Attendance_PunchInOut_Object.Test.getText();
	   // assertNotEquals(autal, "");

	}

}
