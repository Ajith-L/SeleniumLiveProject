package testcase;

import org.openqa.selenium.support.PageFactory;

import commonFunction.CommonFnction;

public class Admin_Qualification_Edcation extends CommonFnction{

	public void  Edcation() {
		PageFactory.initElements(driver, Admin_Qualification_Edcation_Object.class) ;
	}
}
