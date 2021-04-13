package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_Report_ProjectReport_Object {

	@FindBy(linkText="Time")
	public static WebElement Time;

	@FindBy(xpath="//a[@id='menu_time_Reports']")
	public static WebElement Report;
	
	@FindBy(xpath="//a[@id='menu_time_displayProjectReportCriteria']")
	public static WebElement ProjectReport;
	
	@FindBy(xpath="//select[@id='time_project_name']")
	public static WebElement SelectProject;
	
	
	@FindBy(xpath="")
	public static WebElement Test;
}
