package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.PIM_Configration_CustomFiled_Object;

public class PIM_Configration_CustomFiled  extends CommonFnction{
	
	@Test
	public void CustomFiled() {
	
	PageFactory.initElements(driver, PIM_Configration_CustomFiled_Object.class) ;
	Actions actions = new Actions(driver);
	actions.moveToElement(PIM_Configration_CustomFiled_Object.PIM);
	actions.moveToElement(PIM_Configration_CustomFiled_Object.PIM_Configration);
	actions.moveToElement(PIM_Configration_CustomFiled_Object.CustomFields);
	actions.click() .build().perform();
	
	String ass=  PIM_Configration_CustomFiled_Object.Test.getText();
	assertEquals(ass, "Remaining number of custom fields: 9");
		
	}
}
