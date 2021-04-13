package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIM_AddEmployee_Object{

    
@FindBy(linkText="PIM")
public static WebElement PIM;

@FindBy(xpath="//a[@id='menu_pim_addEmployee']")
public static WebElement Add_Employee;

@FindBy(xpath="//input[@id='firstName']")
public static WebElement F_Name;


@FindBy(xpath="//input[@id='lastName']")
public static WebElement lastName;

@FindBy(xpath="//input[@id='btnSave']")
public static WebElement SaveBtn;
}
