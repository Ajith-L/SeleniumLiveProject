package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.My_Info_Object;

public class My_Info extends CommonFnction {
   @Test
	public void Info() {
		PageFactory.initElements(driver, My_Info_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(My_Info_Object.Myinfo);
		actions.click().build().perform();
		
		
		String txt= My_Info_Object.Test.getText();
		assertEquals(txt.isEmpty(),true);
	}
}