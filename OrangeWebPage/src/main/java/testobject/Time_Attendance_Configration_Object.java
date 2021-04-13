package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_Attendance_Configration_Object {

	@FindBy(linkText="Time")
	public static WebElement Time;

	@FindBy(xpath="//a[@id='menu_attendance_Attendance']")
	public static WebElement Attendance;
	
	@FindBy(xpath="//a[@id='menu_attendance_configure']")
	public static WebElement Configration;
	
	@FindBy(xpath="//*[@id=\"configureForm\"]/fieldset/ol")
	public static WebElement Test;
}
