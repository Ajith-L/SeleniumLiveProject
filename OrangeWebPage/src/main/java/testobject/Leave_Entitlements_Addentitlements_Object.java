package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Leave_Entitlements_Addentitlements_Object {

	@FindBy(linkText="Leave")
	public static WebElement Leave ;
	
	@FindBy(xpath="//a[@id='menu_leave_Entitlements']")
	public static WebElement Entitlements ;

	@FindBy(xpath="//a[@id='menu_leave_addLeaveEntitlement']")
	public static WebElement Add_Entitlements;
    
	
	@FindBy(xpath="//input[@id='btnCancel']")
	public static WebElement Cancel;
}
