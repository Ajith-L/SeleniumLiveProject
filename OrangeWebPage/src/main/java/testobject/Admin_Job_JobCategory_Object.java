package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Job_JobCategory_Object {

	@FindBy(linkText="Admin")
	public static WebElement Admin;
	
	@FindBy(xpath="//a[@id='menu_admin_Job']")
	public static WebElement Job;
	
	@FindBy(xpath="//ul/li/a[@id='menu_admin_jobCategory']")
	public static WebElement jobCategor;
	
	@FindBy(linkText="Laborers and Helpers")
	public static WebElement txt;
	
}
