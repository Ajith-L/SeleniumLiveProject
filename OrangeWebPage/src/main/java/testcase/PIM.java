package testcase;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.PIM_Object;

public class PIM  extends CommonFnction{
	
	public void Pim_Configration() {
		PageFactory.initElements(driver, PIM_Object.class) ;
		Actions actions = new Actions(driver);
		actions.moveToElement(PIM_Object.PIM);
		actions.moveToElement(PIM_Object.PIM_Configration);
		actions.moveToElement(PIM_Object.Optional_Fields);
		actions.click() .build().perform();
		
	}
	@Test
	public void Optional_Fields() {
		Pim_Configration();
		PageFactory.initElements(driver, PIM_Object.class) ;
		PIM_Object.SaveBtn.click();
		
		Select select = new Select(PIM_Object.CheekBox);
		WebElement cheek=	select.getFirstSelectedOption();
		//scheek.isSelected();
		assertEquals(cheek, true);
	}

}
