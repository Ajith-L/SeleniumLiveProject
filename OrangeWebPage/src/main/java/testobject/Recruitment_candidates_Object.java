package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Recruitment_candidates_Object {

	@FindBy(linkText="Recruitment")
	public static WebElement Recruitment;
	
	@FindBy(xpath="//a[@id='menu_recruitment_viewCandidates']")
	public static WebElement Candidates;
	
	@FindBy(xpath="//*[@id='candidateSearch_jobTitle']")
	public static WebElement Sel_JobTitle;
	
	@FindBy(xpath="//*[@id='btnSrch']")
	public static WebElement BtnSearch;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr/td")
	public static WebElement Test1;
}

