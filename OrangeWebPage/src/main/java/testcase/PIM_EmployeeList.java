package testcase;

import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.PIM_EmployeeList_Object;

public class PIM_EmployeeList extends CommonFnction {
    @Test
	public void Employee() {
	PageFactory.initElements(driver,PIM_EmployeeList_Object.class) ;
	Actions actions = new Actions(driver);
	actions.moveToElement(PIM_EmployeeList_Object.PIM);
	actions.moveToElement(PIM_EmployeeList_Object.EmployeeList);
	actions.click() .build().perform();
	
	PIM_EmployeeList_Object.Name.sendKeys("Odis");
	PIM_EmployeeList_Object.Id.sendKeys("0002");
	PIM_EmployeeList_Object.SearchBtn.click();
	
	String ass= PIM_EmployeeList_Object.Test.getText();
	System.out.println(ass);
	//assertEquals(ass.,"0002" );
	assertNotEquals(ass, "ajith");
	}
}
