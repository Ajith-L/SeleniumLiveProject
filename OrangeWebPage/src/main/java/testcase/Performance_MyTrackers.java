package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Performance_MyTrackers_Object;

public class Performance_MyTrackers extends CommonFnction {


	@Test
	public void MyReview() {
		PageFactory.initElements(driver, Performance_MyTrackers_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Performance_MyTrackers_Object.Performance);
		actions.moveToElement(Performance_MyTrackers_Object.MyTrackers);
		actions.click().build().perform();
		
		String txt= Performance_MyTrackers_Object.test.getText();
		assertEquals(txt.contains("Paulie Moore"), true);
	}
}
