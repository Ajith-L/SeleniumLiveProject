package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Time_Report_attendanceSummary_Object;

public class Time_Report_attendanceSummary extends CommonFnction{

	@Test
	public void attendanceSummary()
	{
     PageFactory.initElements(driver,Time_Report_attendanceSummary_Object.class) ;
     Actions actions = new Actions(driver);
     actions.moveToElement(Time_Report_attendanceSummary_Object.Time);
     actions.moveToElement(Time_Report_attendanceSummary_Object.Reports);
     actions.moveToElement(Time_Report_attendanceSummary_Object.attendanceSummary);
     actions.click().build().perform();
		
   Time_Report_attendanceSummary_Object.Employeename.sendKeys("Alice Duval");
   //Time_Report_attendanceSummary_Object.Employeename.submit();
    String s= Time_Report_attendanceSummary_Object.Employeename.getText();
    System.out.println("print"+s);
     	}

}
