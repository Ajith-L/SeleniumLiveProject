package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Leave_Entitlements_MyEntitlements_Object {

	@FindBy(linkText="Leave")
	public static WebElement Leave ;
   
	@FindBy(xpath="//*[@id=\"menu_leave_Entitlements\"]")
	public static WebElement Entitlements ;

	
	@FindBy(xpath="//*[@id=\"menu_leave_viewMyLeaveEntitlements\"]")
	public static WebElement MyEntitlements ;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody")
	public static WebElement Table;

}
