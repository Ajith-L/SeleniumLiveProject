package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyLeave_Report_LeaveEntitlementsageReport_Object {

	@FindBy(linkText="Leave")
	public static WebElement Leave ;

	@FindBy(xpath="//a[@id='menu_leave_Reports']")
	public static WebElement  Report ;


	@FindBy(xpath="//*[@id=\"menu_leave_viewMyLeaveBalanceReport\"]")
	public static WebElement  MYLeaveEntitlementsageReport;
    
	
	@FindBy(xpath="//*[@id=\"report-results\"]/div/table/tbody")
	public static WebElement  Test1;
}
