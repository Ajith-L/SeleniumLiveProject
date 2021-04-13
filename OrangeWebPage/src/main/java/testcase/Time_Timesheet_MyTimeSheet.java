package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Time_Timesheet_MyTimeSheet_Object;

public class Time_Timesheet_MyTimeSheet extends CommonFnction {
@Test
public void MyTimeSheet() {
PageFactory.initElements(driver,Time_Timesheet_MyTimeSheet_Object.class) ;
Actions actions = new Actions(driver);
actions.moveToElement(Time_Timesheet_MyTimeSheet_Object.Time);
actions.moveToElement(Time_Timesheet_MyTimeSheet_Object.Timesheet);
actions.moveToElement(Time_Timesheet_MyTimeSheet_Object.MyTimeSheet);
actions.click().build().perform();

String ast= Time_Timesheet_MyTimeSheet_Object.Test.getText();
assertEquals(ast, "No Records Found");
}
}
