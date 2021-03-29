
package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Organization_Structure_Object {
	
	@FindBy(linkText="Admin")
	public static WebElement admin;
	
	@FindBy(xpath="//li[3]//a[@id='menu_admin_Organization']")
	public static WebElement Organization;

	
	@FindBy(xpath="//ul//li[3]//a[@id='menu_admin_viewCompanyStructure']")
	public static WebElement Structure;

	
	@FindBy(xpath="//p//input[@id='btnEdit']")
	public static WebElement  EditBtn;

	@FindBy(xpath="//p//input[@id='btnEdit']")
	public static WebElement DoneBtn;
}
