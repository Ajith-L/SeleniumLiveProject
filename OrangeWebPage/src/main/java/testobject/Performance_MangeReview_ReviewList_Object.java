package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Performance_MangeReview_ReviewList_Object {

	@FindBy(linkText="Performance")
	public static WebElement Performance;
	
	@FindBy(xpath="//a[@id='menu_performance_ManageReviews']")
	public static WebElement ManageReviews;
	
	
	@FindBy(xpath="//a[@id='menu_performance_searchEvaluatePerformancReview']")
	public static WebElement ReviewList;
	
	@FindBy(xpath="//*[@id=\"frmList_ohrmListComponent\"]")
	public static WebElement Test;
}
