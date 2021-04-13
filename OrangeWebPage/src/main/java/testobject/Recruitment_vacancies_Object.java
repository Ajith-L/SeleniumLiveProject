package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Recruitment_vacancies_Object {

	@FindBy(linkText="Recruitment")
	public static WebElement Recruitment;
	
	@FindBy(xpath="//*[@id='menu_recruitment_viewJobVacancy']")
	public static WebElement Vacancy;
	
	@FindBy(xpath="//*[@id='vacancySearch_jobVacancy']")
	public static WebElement Sel_Vacancy;
	
	@FindBy(xpath="//*[@id='btnSrch']")
	public static WebElement Ser_Btn;
	
	@FindBy(xpath="//*[@id='resultTable']//tbody")
	public static WebElement Test1;
}
