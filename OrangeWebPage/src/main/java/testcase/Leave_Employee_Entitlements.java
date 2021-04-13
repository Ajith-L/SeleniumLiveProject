package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Leave_Employee_Entitlements_Object;

public class  Leave_Employee_Entitlements extends CommonFnction {
    @Test
	public void Entitlements() {
    	PageFactory.initElements(driver,Leave_Employee_Entitlements_Object.class) ;
    	Actions actions = new Actions(driver);
    	actions.moveToElement(Leave_Employee_Entitlements_Object.Leave);
    	actions.moveToElement(Leave_Employee_Entitlements_Object.Entitlements);
    	actions.moveToElement(Leave_Employee_Entitlements_Object.Employee_Entitlements);
    	actions.click() .build().perform();

    	
    	boolean asst=Leave_Employee_Entitlements_Object.show.isDisplayed();
    	assertEquals(asst, true);
    	Leave_Employee_Entitlements_Object.Hiden.click();
    	boolean asst2=Leave_Employee_Entitlements_Object.show.isDisplayed();
        assertEquals(asst2, true);
	}
}
