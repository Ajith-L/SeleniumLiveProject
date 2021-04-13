package testobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Performance_Configre_KPIs_Object {

	@FindBy(linkText="Performance")
	public static WebElement Performance;
	
	@FindBy(xpath="//a[@id='menu_performance_Configure']")
	public static WebElement configure;
	
	@FindBy(xpath="//a[@id='menu_performance_searchKpi']")
	public static WebElement KPIs;
	
	
	@FindBy(xpath="//*[@id='kpi360SearchForm_jobTitleCode']")
	public static WebElement Sel_job;
	
	@FindBy(xpath="//*[@id='searchBtn']")
	public static WebElement ScrBtn;
	
	
	@FindBy(xpath="//*[@id='resultTable']/tbody")
	public static WebElement Test;
}
