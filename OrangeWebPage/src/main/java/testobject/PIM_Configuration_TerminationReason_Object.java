package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIM_Configuration_TerminationReason_Object {

	@FindBy(linkText="PIM")
	public  static WebElement PIM;
	    
	@FindBy(xpath="//li/a[@id='menu_pim_Configuration']")
	public static WebElement  PIM_Configration;
	
	@FindBy(xpath="//a[@id='menu_pim_viewTerminationReasons']")
	public static WebElement TerminationReasons;
	
	@FindBy(xpath="//table[@id='recordsListTable']")
	public static WebElement Test1;
}
