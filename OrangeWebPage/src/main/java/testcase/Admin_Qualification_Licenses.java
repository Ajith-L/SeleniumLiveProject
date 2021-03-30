package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Qualification_Licenses_Object;

public class Admin_Qualification_Licenses extends CommonFnction {
   
	@Test
	public void Licenses() {
		PageFactory.initElements(driver, Admin_Qualification_Licenses_Object.class);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Qualification_Licenses_Object.admin);
		actions.moveToElement(Admin_Qualification_Licenses_Object.Qualifications);
		actions.moveToElement(Admin_Qualification_Licenses_Object.Licenses);
		actions.click().build().perform();

        Admin_Qualification_Licenses_Object.table.isEnabled();
				
		//System.out.println("size" +  size  );
				
	}
}
