package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Leave_Configure_LeavePeriod_Object;

public class Leave_Configure_LeavePeriod extends CommonFnction {
@Test
public void LeavePeriod() {
	PageFactory.initElements(driver,Leave_Configure_LeavePeriod_Object.class) ;
	Actions actions = new Actions(driver);
	actions.moveToElement(Leave_Configure_LeavePeriod_Object.Leave);
	actions.moveToElement(Leave_Configure_LeavePeriod_Object.Configure);
	actions.moveToElement(Leave_Configure_LeavePeriod_Object.LeavePeriod);
	actions.click() .build().perform();
	
	
	String ast= Leave_Configure_LeavePeriod_Object.test.getText();
	int len= ast.length();
	assertEquals(len,304);
}
}
