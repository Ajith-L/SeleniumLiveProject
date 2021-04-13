package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_Projectinfo_project_Object {

	
	@FindBy(linkText="Time")
	public static WebElement Time;

	@FindBy(xpath="//a[@id='menu_admin_ProjectInfo']")
	public static WebElement ProjectInfo;

	@FindBy(xpath="//a[@id='menu_admin_viewProjects']")
	public static WebElement project;

	@FindBy(xpath="")
	public static WebElement Test;

}
