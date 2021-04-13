package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_Report_attendanceSummary_Object {

	@FindBy(linkText="Time")
	public static WebElement Time;

	@FindBy(xpath="//a[@id='menu_time_Reports']")
	public static WebElement Reports;
	
	@FindBy(xpath="//*[@id=\"menu_time_displayAttendanceSummaryReportCriteria\"]")
	public static WebElement attendanceSummary;
	
	@FindBy(xpath="//*[@id='employee_name']")
	public static WebElement Employeename;
}
