package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Job_PayGrades_Object {
	
	@FindBy(linkText="Admin")
	public static WebElement Admin;
	
	@FindBy(xpath="//a[@id='menu_admin_Job']")
	public static WebElement Job;
	
	@FindBy(xpath="//li//a[@id='menu_admin_viewPayGrades']")
	public static WebElement Pay_Grade;
	
	
	@FindBy(xpath="//input[@id='ohrmList_chkSelectRecord_2']")
	public static WebElement Tick;
}
