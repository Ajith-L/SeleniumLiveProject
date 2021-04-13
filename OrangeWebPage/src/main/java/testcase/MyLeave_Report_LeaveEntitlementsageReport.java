package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.MyLeave_Report_LeaveEntitlementsageReport_Object;

public class MyLeave_Report_LeaveEntitlementsageReport extends CommonFnction{
	@Test
	public void LeaveEntitlementsageReport() {
		PageFactory.initElements(driver,MyLeave_Report_LeaveEntitlementsageReport_Object.class) ;
		Actions actions = new Actions(driver);
		actions.moveToElement(MyLeave_Report_LeaveEntitlementsageReport_Object.Leave);
		actions.moveToElement(MyLeave_Report_LeaveEntitlementsageReport_Object.Report);
		actions.moveToElement(MyLeave_Report_LeaveEntitlementsageReport_Object.MYLeaveEntitlementsageReport);
		actions.click() .build().perform();
		
		String ast= MyLeave_Report_LeaveEntitlementsageReport_Object.Test1.getText();
		ast.contains("US");
		assertEquals(ast,true);
	}
}
