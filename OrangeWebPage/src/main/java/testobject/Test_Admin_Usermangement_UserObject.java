package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Test_Admin_Usermangement_UserObject {
	

	@FindBy(linkText="Admin")
	public static WebElement Admin;
    
	@FindBy(xpath="//a[@id='menu_admin_UserManagement']")
	public static WebElement UserManagement;
	
	@FindBy(xpath="//li/a[@id='menu_admin_viewSystemUsers']")//child::
	public static WebElement Users;
	
	@FindBy(xpath="//input[@id='searchSystemUser_userName']")
	public static WebElement Username;
	
	@FindBy(xpath="//select[@id='searchSystemUser_userType']")
	public static WebElement  UserRole;
	
	@FindBy(xpath="//input[@id='searchSystemUser_employeeName_empName']")
	public static WebElement Employee_Name;
	
	@FindBy(xpath="//select[@id='searchSystemUser_status']")
	public static WebElement Status;
	
	@FindBy(xpath="//input[@id='searchBtn']")
	public static WebElement Search_Btn;
	
	@FindBy(xpath="//td/a[@linkText(Aatmaram)]")
	public static WebElement ast;
}
