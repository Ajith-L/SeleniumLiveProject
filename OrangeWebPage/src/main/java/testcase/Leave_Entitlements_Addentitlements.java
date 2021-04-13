package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Leave_Entitlements_Addentitlements_Object;

public class Leave_Entitlements_Addentitlements extends CommonFnction {
  @Test
	public void Addentitlements() {
	PageFactory.initElements(driver,Leave_Entitlements_Addentitlements_Object.class) ;
	Actions actions = new Actions(driver);
	actions.moveToElement(Leave_Entitlements_Addentitlements_Object.Leave);
	actions.moveToElement(Leave_Entitlements_Addentitlements_Object.Entitlements);
	actions.moveToElement(Leave_Entitlements_Addentitlements_Object.Add_Entitlements);
	actions.click() .build().perform();
	
	Leave_Entitlements_Addentitlements_Object.Cancel.click();
	}
}
