package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_nationalites_Object {

	@FindBy(linkText="Admin")
	public static WebElement Admin;
	
	@FindBy(xpath="//a[@id='menu_admin_nationality']")
	public static WebElement nationalites;
	
	@FindBy(xpath="//div//input[@id='btnAdd']")
	public static WebElement AddBtn;
	
	@FindBy(xpath="//input[@id='nationality_name']")
	public static WebElement Name;
	
	@FindBy(xpath="//*[@id=\"frmNationality\"]/fieldset/ol/li[1]/span")
	public static WebElement ast;
}
