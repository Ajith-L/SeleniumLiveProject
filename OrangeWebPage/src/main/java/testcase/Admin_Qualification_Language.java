package testcase;

import org.openqa.selenium.support.PageFactory;

import commonFunction.CommonFnction;
import testobject.Admin_Qualification_Langage_Object;

public class Admin_Qualification_Language extends CommonFnction {
 public void Language() {
	 PageFactory.initElements(driver, Admin_Qualification_Langage_Object.class);
	 
	 
 }
	  
}
