package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Leave_Report_LeaveEntitlementsageReport_Object;

public class Leave_Report_LeaveEntitlementsageReport extends CommonFnction {
	@Test
	public void LeaveEntitlementsageReport() {
		PageFactory.initElements(driver,Leave_Report_LeaveEntitlementsageReport_Object.class) ;
		Actions actions = new Actions(driver);
		actions.moveToElement(Leave_Report_LeaveEntitlementsageReport_Object.Leave);
		actions.moveToElement(Leave_Report_LeaveEntitlementsageReport_Object.Report);
		actions.moveToElement(Leave_Report_LeaveEntitlementsageReport_Object.LeaveEntitlementsageReport);
		actions.click() .build().perform();
		
		Select select = new Select(Leave_Report_LeaveEntitlementsageReport_Object.GeneratorForYou);
		select.selectByIndex(1);
		
		Select select2= new Select(Leave_Report_LeaveEntitlementsageReport_Object.LeaveType);
		select2.selectByVisibleText("CAN - Personal");
     
		Leave_Report_LeaveEntitlementsageReport_Object.Search_Btn.click();
		
		String ast=	 Leave_Report_LeaveEntitlementsageReport_Object.test1.getText();
	    assertEquals(ast.indexOf("Odis Adalwin"),0);
	}

}
