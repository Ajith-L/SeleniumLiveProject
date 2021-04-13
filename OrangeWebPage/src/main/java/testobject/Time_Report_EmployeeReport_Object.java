package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_Report_EmployeeReport_Object {
  
	@FindBy(linkText="Time")
	public static WebElement Time;

	@FindBy(xpath="//a[@id='menu_time_Reports']")
	public static WebElement Reports;
	
	@FindBy(xpath="//a[@id='menu_time_displayEmployeeReportCriteria']")
	public static WebElement EmployeeReport;
	
	@FindBy(xpath="//*[@id='employee_empName']")
	public static WebElement EmployeeName;
	
	@FindBy(xpath="//*[@id='employee_empName']")
	public static WebElement Test;
	

}
