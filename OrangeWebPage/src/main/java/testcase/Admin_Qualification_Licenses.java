package testcase;

import org.openqa.selenium.support.PageFactory;

import commonFunction.CommonFnction;
import testobject.Admin_Qualification_Licenses_Object;

public class Admin_Qualification_Licenses extends CommonFnction {
   
	public void Licenses() {
		PageFactory.initElements(driver, Admin_Qualification_Licenses_Object.class);
	}
}
