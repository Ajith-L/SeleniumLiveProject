package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Admin_Organization_Location_Object;

public class Admin_Organization_Location extends CommonFnction {

	@Test
	public void OrganizationLocation() {

		PageFactory.initElements(driver, Admin_Organization_Location_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Organization_Location_Object.Admin);
		actions.moveToElement(Admin_Organization_Location_Object.Organization);
		actions.moveToElement(Admin_Organization_Location_Object.Locations);
		actions.click().build().perform();
    
		Admin_Organization_Location_Object.Location_name.sendKeys("New York Sales Office");
		Admin_Organization_Location_Object.City.sendKeys("New York");
	    
		Select select = new Select( Admin_Organization_Location_Object.City);
		select.selectByVisibleText("United States");
		
	}
}
