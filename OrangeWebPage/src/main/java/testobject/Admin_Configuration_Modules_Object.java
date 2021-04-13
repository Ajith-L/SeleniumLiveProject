package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Configuration_Modules_Object {
	
	@FindBy(linkText="Admin")
	public static WebElement Admin;

	@FindBy(xpath="//li//a[@id='menu_admin_Configuration']")
	public static WebElement Configuration;
	
	@FindBy(xpath="//a[@id='menu_admin_viewModules']")
	public static WebElement Modules;

}
