package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_Attendance_Myrecord_Object {

	@FindBy(linkText="Time")
	public static WebElement Time;

	@FindBy(xpath="//a[@id='menu_attendance_Attendance']")
	public static WebElement Attendance;
	
	@FindBy(xpath="//a[@id='menu_attendance_viewMyAttendanceRecord']")
	public static WebElement MyRecord;
	
	@FindBy(xpath="//*[@id='attendance_date']")
	public static WebElement Date;
	
	@FindBy(xpath="//*[@id=\"noRecordsColumn\"]")
	public static WebElement Test;
}
