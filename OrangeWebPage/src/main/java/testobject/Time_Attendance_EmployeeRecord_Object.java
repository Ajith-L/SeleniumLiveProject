package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_Attendance_EmployeeRecord_Object {

	@FindBy(linkText="Time")
	public static WebElement Time;

	@FindBy(xpath="//a[@id='menu_attendance_Attendance']")
	public static WebElement Attendance;
	
	@FindBy(xpath="//a[@id='menu_attendance_viewAttendanceRecord']")
	public static WebElement AttendanceRecord;
	
	@FindBy(xpath="//*[@id='attendance_employeeName_empName']")
	public static WebElement EmpName;
	
	@FindBy(xpath="//*[@id='attendance_date']")
	public static WebElement Date;
	
	@FindBy(xpath="//*[@id='btView']")
	public static WebElement ViewBtn;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr/td[2]")
	public static WebElement test;
}
