package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Time_Report_ProjectReport_Object;

public class Time_Report_ProjectReport extends CommonFnction {

	@Test
	public void ProjectReport() {
		PageFactory.initElements(driver, Time_Report_ProjectReport_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Time_Report_ProjectReport_Object.Time);
		actions.moveToElement(Time_Report_ProjectReport_Object.Report);
		actions.moveToElement(Time_Report_ProjectReport_Object.ProjectReport);
		actions.click().build().perform();
		
		Select select = new Select(Time_Report_ProjectReport_Object.SelectProject);
		select.selectByVisibleText("Apache Software Foundation - ASF - Phase 1");
     
		boolean actal= Time_Report_ProjectReport_Object.SelectProject.isSelected();
		assertEquals(actal, false);
		
	}

}
