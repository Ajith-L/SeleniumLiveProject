package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIM_Reports_Objecct {
	
    
@FindBy(linkText="PIM")
public static WebElement  PIM;


@FindBy(xpath="//a[@id='menu_core_viewDefinedPredefinedReports']")
public static WebElement  Report ;

}
