package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_Info_Object {
   @FindBy(linkText="My Info")
	public static WebElement Myinfo;
   
   
   @FindBy(xpath="//*[@id='personal_txtEmpFirstName']")
   public static WebElement Test;
}
