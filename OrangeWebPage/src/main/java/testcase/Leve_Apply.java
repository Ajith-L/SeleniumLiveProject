package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Leve_Apply_Object;

public class Leve_Apply extends CommonFnction {
	@Test
	public void LeveApply() {
		PageFactory.initElements(driver, Leve_Apply_Object.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(Leve_Apply_Object.Leave);
		actions.moveToElement(Leve_Apply_Object.Apply);
		actions.click().build().perform();
		
	   Leve_Apply_Object.From_Date.clear();
	   
       Leve_Apply_Object.From_Date.sendKeys("2020-01-01");
       
       Leve_Apply_Object.To_Date.clear();
       Leve_Apply_Object.To_Date.sendKeys("2021-01-01");
       
      boolean ass1=  Leve_Apply_Object.Cheeck_box.isSelected();
      assertEquals(ass1, true);
      
      Leve_Apply_Object.Search_Btn.click();
      
    //  Dimension di= Leve_Apply_Object.Table_size.getSize();
   //  int af =  di.getHeight();
     
    // String  st= di.toString();
     
     	  
	}
}
