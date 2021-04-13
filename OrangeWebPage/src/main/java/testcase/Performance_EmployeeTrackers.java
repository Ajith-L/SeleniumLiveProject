package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Performance_EmployeeTrackers_Object;

public class Performance_EmployeeTrackers extends CommonFnction {
	

	@Test
	public void MyReview() {
		PageFactory.initElements(driver, Performance_EmployeeTrackers_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Performance_EmployeeTrackers_Object.Performance);
		actions.moveToElement(Performance_EmployeeTrackers_Object.EmployeeTrackers);
		actions.click().build().perform();
		
		String txt= Performance_EmployeeTrackers_Object.Test.getText();
		assertEquals(txt.contains("Fiona Grace"), true);
	}
}
