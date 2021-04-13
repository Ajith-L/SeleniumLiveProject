package testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.PIM_AddEmployee_Object;

public class PIM_AddEmployee extends CommonFnction{
    @Test
	public void AddEmployee() {
	PageFactory.initElements(driver,PIM_AddEmployee_Object.class);
	Actions actions = new Actions(driver);
	actions.moveToElement(PIM_AddEmployee_Object.PIM);
	actions.moveToElement(PIM_AddEmployee_Object.Add_Employee);
	actions.click().build().perform();
	
	PIM_AddEmployee_Object.F_Name.sendKeys("siva");
	PIM_AddEmployee_Object.lastName.sendKeys("murgan");
	PIM_AddEmployee_Object.SaveBtn.click();
}
}
