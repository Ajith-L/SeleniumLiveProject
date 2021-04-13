package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_Timesheets_EmployeeTimesheet_Object {

	@FindBy(linkText="Time")
	public static WebElement Time;

	@FindBy(xpath="//a[@id='menu_time_Timesheets']")
	public static WebElement Timesheets;
	
	@FindBy(xpath="//a[@id='menu_time_viewEmployeeTimesheet']")
	public static WebElement EmployeeTimeSheet;
	

	@FindBy(xpath="//*[@id='employee']")
	public static WebElement EmployeeName;
	
	@FindBy(xpath="//*[@id='btnView']")
	public static WebElement viewbtn ;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[1]")
	public static WebElement Test ;
	
}
