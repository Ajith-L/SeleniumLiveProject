package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Configuration_EmailSubscripition_object {

	@FindBy(linkText="Admin")
	public static WebElement Admin;

	@FindBy(xpath="//li//a[@id='menu_admin_Configuration']")
	public static WebElement Configuration;
	
	@FindBy(xpath="//a[@id='menu_admin_viewEmailNotification']")
	public static WebElement  EmailSubscripitio;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[1]/td[1]")
	public static WebElement Test;
}
