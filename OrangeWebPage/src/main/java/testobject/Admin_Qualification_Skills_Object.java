package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Qualification_Skills_Object {

	@FindBy(linkText="Admin")
	public static WebElement admin;
	
	@FindBy(xpath="//a[@id='menu_admin_Qualifications']")
	public static WebElement Qualifications ;
	
	@FindBy(xpath="//ul//li[1]//a[@id='menu_admin_viewSkills']")
	public static WebElement  Skils;
	
	
	@FindBy(xpath="")
	public static WebElement ad;
}
