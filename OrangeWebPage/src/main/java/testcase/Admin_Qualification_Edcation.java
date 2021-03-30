package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Qualification_Edcation_Object;

public class Admin_Qualification_Edcation extends CommonFnction{
   
	@Test
	public void  Edcation() {
		PageFactory.initElements(driver, Admin_Qualification_Edcation_Object.class) ;
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Qualification_Edcation_Object.admin);
		actions.moveToElement(Admin_Qualification_Edcation_Object.Qualifications);
		actions.moveToElement(Admin_Qualification_Edcation_Object.Education);
		actions.click().build().perform();
		
        boolean test1= Admin_Qualification_Edcation_Object.click.isSelected();
		
		assertEquals(test1, false); //Before click
		
		Admin_Qualification_Edcation_Object.click.click();
		
		boolean test2= Admin_Qualification_Edcation_Object.click.isSelected();
		
		assertEquals(test2, true);  //After click
		
	}
}

