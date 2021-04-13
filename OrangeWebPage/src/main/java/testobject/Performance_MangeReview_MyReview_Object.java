package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Performance_MangeReview_MyReview_Object {

	
	@FindBy(linkText="Performance")
	public static WebElement Performance;
	
	@FindBy(xpath="//a[@id='menu_performance_ManageReviews']")
	public static WebElement ManageReviews;
	
	@FindBy(xpath="//*[@id=\"mainMenuFirstLevelUnorderedList\"]/li[7]/ul/li[2]/ul/li[2]")
	public static WebElement MyReviw;
	
	@FindBy(xpath="//*[@id=\"search-results\"]/div[2]")
	public static WebElement Test;
}