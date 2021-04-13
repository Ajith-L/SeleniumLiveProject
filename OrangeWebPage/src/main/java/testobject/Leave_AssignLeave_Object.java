package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Leave_AssignLeave_Object {

	@FindBy(linkText="Leave")
	public static WebElement Leave ;

	@FindBy(xpath="//a[@id='menu_leave_assignLeave']")
	public static WebElement  AssignLeave;
	
	@FindBy(xpath="//*[@id='assignleave_txtEmployee_empName']")
	public static WebElement EmployeeName;
	
	@FindBy(xpath="//*[@id='assignleave_txtLeaveType']")
	public static WebElement LeaveType;
	
	@FindBy(xpath="//*[@id='assignleave_txtFromDate']")
	public static WebElement FromDate;
	
	@FindBy(xpath="//*[@id='assignleave_txtToDate']")
	public static WebElement ToDate;
	
	
	@FindBy(xpath="//*[@id='assignBtn']")
	public static WebElement Searchbtn;
	
	@FindBy(xpath="//*[@id=\"assignleave_leaveBalance\"]")
	public static WebElement LeaveBal;
}
