package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Performance_Configre_Tracker_Object;

public class Performance_Configre_Tracker extends CommonFnction{

	@Test
	public void Tracker() {
	 PageFactory.initElements(driver, Performance_Configre_Tracker_Object.class);
	 Actions actions= new Actions(driver);
	 actions.moveToElement(Performance_Configre_Tracker_Object.Performance);
	 actions.moveToElement(Performance_Configre_Tracker_Object.configure);
	 actions.moveToElement(Performance_Configre_Tracker_Object.Tracker);
	 actions.click().build().perform();
	 
	 String txt= Performance_Configre_Tracker_Object.test.getText();
	assertEquals(txt.contains("Garry White"), true);
	}
}
