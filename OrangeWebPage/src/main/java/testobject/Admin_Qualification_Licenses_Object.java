package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Qualification_Licenses_Object {

	@FindBy(linkText="Admin")
	public static WebElement admin;
	
	@FindBy(xpath="//a[@id='menu_admin_Qualifications']")
	public static WebElement Qualifications ;
	
	@FindBy(xpath="//ul//li[3]//a[@id='menu_admin_viewLicenses']")
	public static WebElement Licenses;
	
	
	@FindBy(xpath="//*[@id='recordsListTable']")
	public static WebElement table;
}
