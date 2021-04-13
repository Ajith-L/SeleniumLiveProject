package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Leave_Entitlements_MyEntitlements_Object;

public class Leave_Entitlements_MyEntitlements extends CommonFnction {
 
	@Test
	public void MyEntitlement() {
		PageFactory.initElements(driver,Leave_Entitlements_MyEntitlements_Object.class) ;
		Actions actions = new Actions(driver);
		actions.moveToElement(Leave_Entitlements_MyEntitlements_Object.Leave);
		actions.moveToElement(Leave_Entitlements_MyEntitlements_Object.Entitlements);
		actions.moveToElement(Leave_Entitlements_MyEntitlements_Object.MyEntitlements);
		actions.click() .build().perform();
        
		String txt= Leave_Entitlements_MyEntitlements_Object.Table.getText();
		assertEquals(txt, "No Records Found");
	}
}
