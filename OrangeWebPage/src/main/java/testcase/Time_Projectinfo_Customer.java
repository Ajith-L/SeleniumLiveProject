package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Time_Projectinfo_Customer_Object;

public class Time_Projectinfo_Customer extends CommonFnction{

	
	@Test
	public void  Customer(){
	PageFactory.initElements(driver,Time_Projectinfo_Customer_Object.class) ;
	Actions actions = new Actions(driver);
	actions.moveToElement(Time_Projectinfo_Customer_Object.Time);
	actions.moveToElement(Time_Projectinfo_Customer_Object.Projectinfo);
	actions.moveToElement(Time_Projectinfo_Customer_Object.Customer);
	actions.click().build().perform();
	
	
			Time_Projectinfo_Customer_Object.Test.click();
			boolean te2= Time_Projectinfo_Customer_Object.Test.isDisplayed();
			assertEquals(te2, true);
		}

}
