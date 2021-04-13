package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_Attendance_PunchInOut_Object {

	@FindBy(linkText="Time")
	public static WebElement Time;

	@FindBy(xpath="//a[@id='menu_attendance_Attendance']")
	public static WebElement Attendance;
	
	@FindBy(xpath="//a[@id='menu_attendance_punchIn']")
	public static WebElement PunchInOut;
	
	
	@FindBy(xpath="//*[@id='btnPunch']")
	public static WebElement PunchIn;
	
	@FindBy(className="punchOutbutton")
	public static WebElement PunchOut;
	
	@FindBy(xpath="//*[@id=\"successBodyEdit\"]")
	public static WebElement Test;
}
