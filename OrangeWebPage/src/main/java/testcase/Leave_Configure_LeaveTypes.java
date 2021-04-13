package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Leave_Configure_LeaveTypes_Object;

public class Leave_Configure_LeaveTypes extends CommonFnction {
    @Test
	public void LeaveTypes() {
		PageFactory.initElements(driver,Leave_Configure_LeaveTypes_Object.class) ;
		Actions actions = new Actions(driver);
		actions.moveToElement(Leave_Configure_LeaveTypes_Object.Leave);
		actions.moveToElement(Leave_Configure_LeaveTypes_Object.Configure);
		actions.moveToElement(Leave_Configure_LeaveTypes_Object.LeaveType);
		actions.click() .build().perform();
		
		
       //  Select select = new Select( Leave_Configure_LeaveTypes_Object.test);
        // select.selectByVisibleText("CAN - Bereavement");
         
         
	}
}
