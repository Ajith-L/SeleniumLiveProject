package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_Projectinfo_Customer_Object {

	
	@FindBy(linkText="Time")
	public static WebElement Time;

	@FindBy(xpath="//a[@id='menu_admin_ProjectInfo']")
	public static WebElement Projectinfo;
	
	
	@FindBy(xpath="//a[@id='menu_admin_viewCustomers']")
	public static WebElement Customer;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/thead/tr/th[1]")
	public static WebElement Test;
}
