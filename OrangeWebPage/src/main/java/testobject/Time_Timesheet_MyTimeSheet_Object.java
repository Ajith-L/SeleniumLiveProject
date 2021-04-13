package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_Timesheet_MyTimeSheet_Object {
	@FindBy(linkText="Time")
	public static WebElement Time;

	@FindBy(xpath="//a[@id='menu_time_Timesheets']")
	public static WebElement Timesheet;
	
	@FindBy(xpath="//a[@id='menu_time_viewMyTimesheet']")
	public static WebElement MyTimeSheet;
	
	@FindBy(xpath="//*[@id=\"noRecordsColumn\"]")
	public static WebElement Test;
}
