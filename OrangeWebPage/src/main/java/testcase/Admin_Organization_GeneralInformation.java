package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Organization_GeneralInformation_Object;

public class Admin_Organization_GeneralInformation extends CommonFnction {
	
	@Test
	 public void Gen_information() {
		 PageFactory.initElements(driver, Admin_Organization_GeneralInformation_Object.class);
		 Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Organization_GeneralInformation_Object.Admin);
		actions.moveToElement(Admin_Organization_GeneralInformation_Object.Organization);
		actions.moveToElement(Admin_Organization_GeneralInformation_Object.GeneralInformation);
		actions.click().build().perform();
		
		Admin_Organization_GeneralInformation_Object.Editbtn.click();
		Admin_Organization_GeneralInformation_Object.Note.clear();
		Admin_Organization_GeneralInformation_Object.Note.sendKeys("HRM Software");
		Admin_Organization_GeneralInformation_Object.SaveBtn.click();
		
	//String print=	Admin_Organization_GeneralInformation_Object.Ast.getText();
	//assertEquals(print,"HRM Software","Tested");
	//System.out.println(print);
	 }

}
