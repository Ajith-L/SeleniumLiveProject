package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Recruitment_candidates_Object;

public class Recruitment_candidates extends CommonFnction {
    @Test
	public void candidates() {
    	
		PageFactory.initElements(driver, Recruitment_candidates_Object.class);
		Actions actions= new Actions(driver);
		actions.moveToElement(Recruitment_candidates_Object.Recruitment);
		actions.moveToElement(Recruitment_candidates_Object.Candidates);
		actions.click().build().perform();
		
		Select select = new Select(Recruitment_candidates_Object.Sel_JobTitle);
		select.selectByVisibleText("QA Engineer");
		
		
		Recruitment_candidates_Object.BtnSearch.click();
		
		String txt= Recruitment_candidates_Object.Test1.getText();
		assertEquals(txt,"No Records Found");
	}
}
