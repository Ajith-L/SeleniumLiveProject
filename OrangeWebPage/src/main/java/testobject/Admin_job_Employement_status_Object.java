package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_job_Employement_status_Object {

	@FindBy(linkText="Admin")
	public static WebElement Admin;
	
	@FindBy(xpath="//a[@id='menu_admin_Job']")
	public static WebElement Job;
	
	@FindBy(xpath="//li/a[@id='menu_admin_employmentStatus']")
	public static WebElement Employement_Status;
	
	@FindBy(xpath="//input[@name='btnAdd']")
	public static WebElement AddBtn;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/input")
	public static WebElement Value;
	
	@FindBy(xpath="//input[@id='btnSave']")
	public static WebElement SaveBtn;
}
