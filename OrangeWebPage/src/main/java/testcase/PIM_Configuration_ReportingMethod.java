package testcase;

import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.PIM_Configuration_ReportingMethod_Object;

public class PIM_Configuration_ReportingMethod extends CommonFnction {

	@Test
	public void ReportingMethod() {
		PageFactory.initElements(driver,PIM_Configuration_ReportingMethod_Object.class) ;
		Actions actions = new Actions(driver);
		actions.moveToElement(PIM_Configuration_ReportingMethod_Object.PIM);
		actions.moveToElement(PIM_Configuration_ReportingMethod_Object.PIM_Configration);
		actions.moveToElement(PIM_Configuration_ReportingMethod_Object.Reporting);
		actions.click() .build().perform();
		
		String ass= PIM_Configuration_ReportingMethod_Object.Test1.getText();
		assertNotEquals(ass, "expected");
	}
}
