package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Leave_Employee_Entitlements_Object {
	
	@FindBy(linkText="Leave")
	public static WebElement Leave ;

	@FindBy(xpath="//*[@id='menu_leave_Entitlements']")
	public static WebElement Entitlements;

		@FindBy(xpath="//*[@id='menu_leave_viewLeaveEntitlements']")
	public static WebElement Employee_Entitlements ;

	@FindBy(xpath="//div[@class='inner']")
	public static WebElement show;
		
	@FindBy(xpath="//*[@class='toggle tiptip']")
	public static WebElement Hiden;
   
	

}
