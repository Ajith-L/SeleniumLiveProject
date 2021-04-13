package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Performance_Configre_KPIs_Object;

public class Performance_Configre_KPIs extends CommonFnction{
   
	@Test
	public void KPIs() {
		PageFactory.initElements(driver, Performance_Configre_KPIs_Object.class);
	    Actions actions= new Actions(driver);
	    actions.moveToElement(Performance_Configre_KPIs_Object.Performance);
	    actions.moveToElement(Performance_Configre_KPIs_Object.configure);
	    actions.moveToElement(Performance_Configre_KPIs_Object.KPIs);
	    actions.click().build().perform();
	    
	    Select select = new Select(Performance_Configre_KPIs_Object.Sel_job);
	    select.selectByVisibleText("QA Engineer");
	    
	    Performance_Configre_KPIs_Object.ScrBtn.click();
	    
	    String txt =Performance_Configre_KPIs_Object.Test.getText();
	    assertEquals(txt.contains("QA"), true);
	    assertEquals(txt.contains("z"), false);
	}
}
 