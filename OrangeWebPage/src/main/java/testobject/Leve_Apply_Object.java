package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Leve_Apply_Object {

	@FindBy(linkText="Leave")
	public static WebElement Leave ;

	@FindBy(xpath="//a[@id='menu_leave_viewMyLeaveList']")
	public static WebElement Apply ;

	@FindBy(xpath="//input[@id='calFromDate']")
	public static  WebElement From_Date;
	
	@FindBy(xpath="//input[@id='calToDate']")
	public static WebElement To_Date;
	
	@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
	public static  WebElement Cheeck_box;
	
	@FindBy(xpath="//input[@id='btnSearch']")
	public static WebElement Search_Btn;
	
	
	@FindBy(xpath="//*[@id='frmList_ohrmListComponent']")
	public static WebElement Table_size;
}
