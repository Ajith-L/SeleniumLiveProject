package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIM_Configration_CustomFiled_Object {

	@FindBy(linkText="PIM")
	public  static WebElement PIM;
    
    @FindBy(xpath="//li/a[@id='menu_pim_Configuration']")
    public static WebElement  PIM_Configration;
    
    @FindBy(xpath="//a[@id='menu_pim_listCustomFields']")
    public static WebElement CustomFields;
    
    @FindBy(xpath="//span[@id='fieldsleft']")
    public static WebElement Test;
}
