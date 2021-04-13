package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Performance_EmployeeTrackers_Object {
	
	@FindBy(linkText="Performance")
	public static WebElement Performance;

	@FindBy(xpath="//*[@id='menu_performance_viewEmployeePerformanceTrackerList']")
	public static WebElement EmployeeTrackers;
   
	@FindBy(xpath="//*[@id='frmList_ohrmListComponent']")
	public static WebElement Test;
}
