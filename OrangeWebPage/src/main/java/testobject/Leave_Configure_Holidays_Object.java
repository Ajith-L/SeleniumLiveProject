package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Leave_Configure_Holidays_Object {

	@FindBy(linkText="Leave")
	public static WebElement Leave ;

	@FindBy(xpath="//*[@id=\"menu_leave_Configure\"]")
	public static WebElement  Configure;
   
	@FindBy(xpath="//a[@id='menu_leave_viewHolidayList']")
	public static WebElement Holidays;
	
	@FindBy(xpath="//*[@id='calFromDate']")
	public static WebElement From;
	
	@FindBy(xpath="//*[@id='calToDate']")
	public static WebElement ToDate;
	
	@FindBy(xpath="//*[@id='btnSearch']")
	public static WebElement SearchBtn;
	
	@FindBy(xpath="//*[@id='tableWrapper']")
	public static WebElement test1;
}
