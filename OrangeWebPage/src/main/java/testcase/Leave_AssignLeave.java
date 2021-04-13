package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Leave_AssignLeave_Object;

public class Leave_AssignLeave extends CommonFnction{
    @Test
	public void AssignLeave() {
		PageFactory.initElements(driver, Leave_AssignLeave_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Leave_AssignLeave_Object.Leave);
		actions.moveToElement(Leave_AssignLeave_Object.AssignLeave);
		actions.click().build().perform();
		
		//Paul Collings
		Leave_AssignLeave_Object.EmployeeName.sendKeys("Paul Collings");
		Select select = new Select(Leave_AssignLeave_Object.LeaveType);
		select.selectByVisibleText("CAN - Bereavement");
		Leave_AssignLeave_Object.FromDate.clear();
		Leave_AssignLeave_Object.FromDate.sendKeys("2020-01-01");
		Leave_AssignLeave_Object.ToDate.clear();
		Leave_AssignLeave_Object.ToDate.sendKeys("2021-01-01");
		
		Leave_AssignLeave_Object.Searchbtn.click();
		
	    String text=	Leave_AssignLeave_Object.LeaveBal.getText();
		assertEquals(text, "");
		
	}
}
