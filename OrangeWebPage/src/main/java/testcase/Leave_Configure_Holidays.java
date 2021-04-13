package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Leave_Configure_Holidays_Object;

public class Leave_Configure_Holidays extends CommonFnction{
    @Test
	public void Holidays() {
		PageFactory.initElements(driver,Leave_Configure_Holidays_Object.class) ;
		Actions actions = new Actions(driver);
		actions.moveToElement(Leave_Configure_Holidays_Object.Leave);
		actions.moveToElement(Leave_Configure_Holidays_Object.Configure);
		actions.moveToElement(Leave_Configure_Holidays_Object.Holidays);
		actions.click() .build().perform();
		
		Leave_Configure_Holidays_Object.From.clear();
		Leave_Configure_Holidays_Object.From.sendKeys("2020-01-01");
		Leave_Configure_Holidays_Object.ToDate.clear();
		Leave_Configure_Holidays_Object.ToDate.sendKeys("2020-12-31");
		
		Leave_Configure_Holidays_Object.SearchBtn.click();
		
		String ts1= Leave_Configure_Holidays_Object.test1.getText();
		boolean pr= ts1.contains("New Year's Day");
		assertEquals(pr, true);

	}
	
}
