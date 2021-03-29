package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Job_WorkShift_Object {

	@FindBy(linkText="Admin")
	public static WebElement Admin;
	
	@FindBy(xpath="//a[@id='menu_admin_Job']")
	public static WebElement Job;
	
	@FindBy(xpath="//ul//li//a[@id='menu_admin_workShift']")
	public static WebElement WorkShift;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a")
	public static WebElement ast;
}
