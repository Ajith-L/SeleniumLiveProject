package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Job_JobTitles_Object {
	
	
	@FindBy(linkText="Admin")
	public static WebElement Admin;
	
	@FindBy(xpath="//a[@id='menu_admin_Job']")
	public static WebElement Job;
	
	@FindBy(xpath="//li/a[@id='menu_admin_viewJobTitleList']")
	public static WebElement JobTitles;
	
	
	@FindBy(xpath="//input[@name='btnAdd']")
	public static WebElement Add_btn;
	
	@FindBy(xpath="//input[@id='jobTitle_jobTitle']")
	public static WebElement Job_Title_Name;
	
	@FindBy(xpath="//input[@id='btnSave']")
	public static WebElement Save_Btn;
	
	@FindBy(xpath="//*[@id='frmList_ohrmListComponent']")
	public static WebElement asert1;
}
