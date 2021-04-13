package testcase;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.PIM_Configuration_TerminationReason_Object;

public class PIM_Configuration_TerminationReason  extends CommonFnction{
    @Test
	public void TerminationReason() {
    	PageFactory.initElements(driver,PIM_Configuration_TerminationReason_Object.class) ;
    	Actions actions = new Actions(driver);
    	actions.moveToElement(PIM_Configuration_TerminationReason_Object.PIM);
    	actions.moveToElement(PIM_Configuration_TerminationReason_Object.PIM_Configration);
    	actions.moveToElement(PIM_Configuration_TerminationReason_Object.TerminationReasons);
    	actions.click() .build().perform();
    	
    	Dimension DN=	PIM_Configuration_TerminationReason_Object.Test1.getSize();
        
    	int len=	DN.toString().length();
    	assertEquals(len, 11);
    	assertNotEquals(len,12);
    	
	}
}
