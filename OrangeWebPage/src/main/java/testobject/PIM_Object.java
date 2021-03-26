package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIM_Object {
    @FindBy(linkText="PIM")
	public  static WebElement PIM;
    
    @FindBy(xpath="//li/a[@id='menu_pim_Configuration']")
    public static WebElement  PIM_Configration;
    
    @FindBy(xpath="//li/a[@id='menu_pim_configurePim']")
    public static WebElement Optional_Fields;
    
    @FindBy(xpath="//input[@id='btnSave']")
    public static WebElement SaveBtn;
    
    @FindBy(xpath="//input[@id='configPim_chkDeprecateFields']")
    public static WebElement CheekBox;
}
