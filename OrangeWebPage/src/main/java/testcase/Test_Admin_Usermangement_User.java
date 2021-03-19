package testcase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.LoginPageObject;

public class Test_Admin_Usermangement_User extends CommonFnction {

	@Test
	public void loginpage() throws IOException {
    
     
		PageFactory.initElements(driver, LoginPageObject.class);
		LoginPageObject.username.sendKeys(properties.getProperty("username"));
		LoginPageObject.password.sendKeys(properties.getProperty("password"));
		LoginPageObject.button.click();
	}
}
