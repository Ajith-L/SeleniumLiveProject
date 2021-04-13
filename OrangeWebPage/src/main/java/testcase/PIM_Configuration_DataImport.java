package testcase;

import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import commonFunction.CommonFnction;
import testobject.PIM_Configuration_DataImport_Object;

public class PIM_Configuration_DataImport extends CommonFnction {

@Test 
public void	DataImport() {
	PageFactory.initElements(driver,PIM_Configuration_DataImport_Object.class) ;
	Actions actions = new Actions(driver);
	actions.moveToElement(PIM_Configuration_DataImport_Object.PIM);
	actions.moveToElement(PIM_Configuration_DataImport_Object.PIM_Configration);
	actions.moveToElement(PIM_Configuration_DataImport_Object.Import);
	actions.click() .build().perform();
	
	String ass= PIM_Configuration_DataImport_Object.Test1.getText();
	
	//System.out.println(ass);		
	
	assertNotEquals(ass, "test");
	
}
	
}
