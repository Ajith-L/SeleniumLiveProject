package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunction.CommonFnction;
import testobject.Recruitment_vacancies_Object;

public class Recruitment_vacancies extends CommonFnction {
    @Test
	public void vacancies() {
	PageFactory.initElements(driver,Recruitment_vacancies_Object.class);
	
	Actions actions = new Actions(driver);
	actions.moveToElement(Recruitment_vacancies_Object.Recruitment);
	actions.moveToElement(Recruitment_vacancies_Object.Vacancy);
	actions.click().build().perform();
	
	Select select= new Select(Recruitment_vacancies_Object.Sel_Vacancy);
	select.selectByVisibleText("Software Engineer");
	
	Recruitment_vacancies_Object.Ser_Btn.click();
	
	String txt= Recruitment_vacancies_Object.Test1.getText();
	//System.out.println(txt.indexOf("s"));
	//System.out.println(txt);
	assertEquals(txt.indexOf("s"), 39);
	}
}
