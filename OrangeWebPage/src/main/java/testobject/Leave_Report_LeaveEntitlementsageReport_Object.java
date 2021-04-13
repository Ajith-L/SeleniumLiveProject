package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Leave_Report_LeaveEntitlementsageReport_Object {

	

@FindBy(linkText="Leave")
public static WebElement Leave ;

@FindBy(xpath="//a[@id='menu_leave_Reports']")
public static WebElement  Report ;


@FindBy(xpath="//a[@id='menu_leave_viewLeaveBalanceReport']")
public static WebElement  LeaveEntitlementsageReport;

@FindBy(xpath="//select[@id='leave_balance_report_type']")
public static WebElement GeneratorForYou;


@FindBy(xpath="//select[@id='leave_balance_leave_type']")
public static WebElement  LeaveType;

@FindBy(xpath="//*[@id='viewBtn']")
public static WebElement Search_Btn;

@FindBy(xpath="//*[@id=\"report-results\"]/div/table/tbody/tr[1]")
public static WebElement test1;

}
