package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Performance_Configre_Tracker_Object {

	@FindBy(linkText="Performance")
	public static WebElement Performance;
	
	@FindBy(xpath="//a[@id='menu_performance_Configure']")
	public static WebElement configure;
	
	@FindBy(xpath="//a[@id='menu_performance_addPerformanceTracker']")
	public static WebElement Tracker;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody")
	public static WebElement test;
	
}
