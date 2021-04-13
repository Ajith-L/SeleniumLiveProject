package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Performance_MangeReview_Review_Object {

	@FindBy(linkText="Performance")
	public static WebElement Performance;
	
	@FindBy(xpath="//a[@id='menu_performance_ManageReviews']")
	public static WebElement ManageReviews;
	
	@FindBy(xpath="//*[@id='menu_performance_viewMyPerformanceTrackerList']")
	public static WebElement  Reviews;
	
	@FindBy(xpath="//*[@id=\"tableWrapper\"]")
	public static WebElement Test;
}

