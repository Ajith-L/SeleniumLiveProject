package loginpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {
	@FindBy(xpath="//input[@id='txtUsername']")
	public static WebElement username;

	@FindBy(xpath="//input[@id='txtPassword']")
	public static WebElement password;

	@FindBy(xpath="//input[@id='btnLogin']")
	public static WebElement button;

}
