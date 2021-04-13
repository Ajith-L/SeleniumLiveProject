package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Leave_LeaveList_Object;

public class Leave_LeaveList extends CommonFnction {
  @Test
	public void LeaveList() {
	  PageFactory.initElements(driver,Leave_LeaveList_Object.class);
		Actions  actions = new Actions(driver);
		actions.moveToElement(Leave_LeaveList_Object.Leave);
		actions.moveToElement(Leave_LeaveList_Object.LeaveList);
		actions.click().build().perform();
	}
	
}
