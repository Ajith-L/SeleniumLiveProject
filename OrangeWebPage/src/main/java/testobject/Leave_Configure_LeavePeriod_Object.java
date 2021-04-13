package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Leave_Configure_LeavePeriod_Object {

	@FindBy(linkText="Leave")
	public static WebElement Leave ;

	@FindBy(xpath="//*[@id=\"menu_leave_Configure\"]")
	public static WebElement  Configure;

	@FindBy(xpath="//a[@id=\"menu_leave_defineLeavePeriod\"]")
	public static WebElement  LeavePeriod;

	@FindBy(xpath="//form[@id='frmLeavePeriod']")
	public static WebElement test ;

}
