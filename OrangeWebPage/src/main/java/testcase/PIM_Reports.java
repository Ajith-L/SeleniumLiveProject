package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.PIM_Reports_Objecct;

public class PIM_Reports extends CommonFnction {
	@Test
	public void Reports() {
	PageFactory.initElements(driver,PIM_Reports_Objecct.class);
	Actions actions = new Actions(driver);
	actions.moveToElement(PIM_Reports_Objecct.PIM);
	actions.moveToElement(PIM_Reports_Objecct.Report);
	actions.click().build().perform();

}
}