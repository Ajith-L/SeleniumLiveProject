package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Qualification_Edcation_Object {

	@FindBy(linkText="Admin")
	public static WebElement admin;
	
	@FindBy(xpath="//a[@id='menu_admin_Qualifications']")
	public static WebElement Qualifications ;
	
	@FindBy(xpath="//ul//li[2]//a[@id='menu_admin_viewEducation']")
	public static WebElement Education;
	
	@FindBy(xpath="//tr//th//input[@id='checkAll']")
	public static WebElement click;
}
