package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Qualification_Langage_Object {

	@FindBy(linkText="Admin")
	public static WebElement admin;
	
	@FindBy(xpath="//a[@id='menu_admin_Qualifications']")
	public static WebElement Qualifications ;
	
	@FindBy(xpath="//ul//li[4]//a[@id='menu_admin_viewLanguages']")
	public static WebElement Languages;
	
	@FindBy(xpath="//*[@id='recordsListTable']/tbody/tr[1]/td[2]/a")
	public static WebElement msg;
}
