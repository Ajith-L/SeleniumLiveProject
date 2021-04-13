package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Performance_MyTrackers_Object {
	
	@FindBy(linkText="Performance")
	public static WebElement Performance;

	@FindBy(xpath="//a[@id='menu_performance_viewMyPerformanceTrackerList']")
	public static WebElement MyTrackers;
	
	@FindBy(xpath="//*[@id='frmList_ohrmListComponent']")
	public static WebElement test;

}
