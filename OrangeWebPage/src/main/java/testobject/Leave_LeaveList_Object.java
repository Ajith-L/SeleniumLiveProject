package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Leave_LeaveList_Object {


	@FindBy(linkText="Leave")
	public static WebElement Leave ;
    
	@FindBy(xpath="//*[@id='menu_leave_viewLeaveList']")
	public static WebElement LeaveList;
}
